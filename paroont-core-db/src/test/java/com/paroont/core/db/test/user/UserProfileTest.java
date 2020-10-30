package com.paroont.core.db.test.user;

import com.paroont.core.db.dao.entity.user.UserProfileBaseDo;
import com.paroont.core.db.dao.impl.user.profile.sql.UserDeleteQueryBuilder;
import com.paroont.core.db.dao.impl.user.profile.sql.UserInsertQueryBuilder;
import com.paroont.core.db.dao.impl.user.profile.sql.UserSelectQueryBuilder;
import com.paroont.core.db.dao.impl.user.profile.sql.UserUpdateQueryBuilder;
import com.paroont.core.shared.dto.common.CoreActionBaseDto;
import com.paroont.core.shared.filter.user.BaseProfileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.Date;

public class UserProfileTest {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileTest.class);
    public static void main(String[] args) {
        UserProfileTest obj = new UserProfileTest();
        obj.testSelect();
        //obj.testUpdate();
       // obj.testDelete();
        //obj.testAdd();
    }

    public void testSelect()
    {
        BaseProfileFilter filter = new BaseProfileFilter();
        filter.setUserProfileId(1);
        filter.setLoginId("9819440106");
        UserSelectQueryBuilder queryBuilder = new UserSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }

    public void testUpdate()
    {
        BaseProfileFilter filter = new BaseProfileFilter();
        filter.setUserProfileId(66);
        filter.setLoginId("9819440106");

        UserProfileBaseDo data = new UserProfileBaseDo();
        data.setUserProfileId(66);
        data.setFirstName("TEst");

        UserProfileBaseDo oldData = new UserProfileBaseDo();
        oldData.setUserProfileId(66);
        oldData.setFirstName("TEstr");

        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId("88");
        actionDto.setActionTs(new Timestamp(new Date().getTime()));


        UserUpdateQueryBuilder queryBuilder = new UserUpdateQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setOldData(oldData);

        queryBuilder.setAction(actionDto);

        queryBuilder.build();
        logger.info("End - testUpdate");
    }

    public void testDelete()
    {


        UserProfileBaseDo data = new UserProfileBaseDo();
        data.setUserProfileId(66);
        data.setFirstName("TEst");


        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId("88");
        actionDto.setActionTs(new Timestamp(new Date().getTime()));


        UserDeleteQueryBuilder queryBuilder = new UserDeleteQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(actionDto);

        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }

    public void testAdd()
    {


        UserProfileBaseDo data = new UserProfileBaseDo();
        data.setUserProfileId(66);
        data.setFirstName("TEst");


        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId("88");
        actionDto.setActionTs(new Timestamp(new Date().getTime()));


        UserInsertQueryBuilder queryBuilder = new UserInsertQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(actionDto);

        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }
}
