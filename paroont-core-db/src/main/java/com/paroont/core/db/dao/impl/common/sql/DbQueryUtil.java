package com.paroont.core.db.dao.impl.common.sql;


import com.paroont.core.db.constant.common.CoreDbConst;
import com.paroont.core.db.enumeration.common.ComparisonOperatorEnum;
import com.paroont.core.db.enumeration.common.ListOperatorEnum;
import com.paroont.core.db.enumeration.common.LogicalOperatorEnum;

import java.util.Optional;

public class DbQueryUtil implements CoreDbConst {

    public static String createNamedParam(String colName)
    {
        return DB_COMMON_PARAM_PREFIX + Optional.ofNullable(colName).orElse("").trim();
    }

    public static String createNamedParam(String colName, LogicalOperatorEnum logicalOpt, ComparisonOperatorEnum comparisonOpt)
    {
        return " " + (null == logicalOpt ? "" : logicalOpt.getKey() + " ") +  colName + " " + comparisonOpt.getKey() +  " " + createNamedParam(colName);
    }

    public static String createNamedParam(String colName, LogicalOperatorEnum logicalOpt, ListOperatorEnum listOpt)
    {
        return " " + (null == logicalOpt ? "" : logicalOpt.getKey() + " ") +  colName + " " + listOpt.getKey() +  " (" + createNamedParam(colName) + ") ";
    }

    public static String createNamedParam(String colName,  ComparisonOperatorEnum comparisonOpt)
    {
        return createNamedParam(colName, null, comparisonOpt);
    }

    public static String createEqualNamedParam(String colName)
    {
        return createNamedParam(colName, null, ComparisonOperatorEnum.EQUAL_TO);
    }

    public static String createNotEqualNamedParam(String colName)
    {
        return createNamedParam(colName, null, ComparisonOperatorEnum.NOT_EQUAL_TO);
    }


    public static String createAndEqualNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.AND, ComparisonOperatorEnum.EQUAL_TO);
    }

    public static String createOrEqualNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.OR, ComparisonOperatorEnum.EQUAL_TO);
    }

    public static String createAndNotEqualNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.AND, ComparisonOperatorEnum.NOT_EQUAL_TO);
    }

    public static String createOrNotEqualNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.OR, ComparisonOperatorEnum.NOT_EQUAL_TO);
    }

    public static String createUpdateNamedParam(String colName)
    {
        return ", " +  colName + " " + ComparisonOperatorEnum.EQUAL_TO.getKey() +  " " + createNamedParam(colName);
    }

    public static String createAndInNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.AND, ListOperatorEnum.IN);
    }

    public static String createAndNotInNamedParam(String colName)
    {
        return createNamedParam(colName, LogicalOperatorEnum.AND, ListOperatorEnum.NOT_IN);
    }
}
