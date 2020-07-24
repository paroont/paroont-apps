package om.rsatech.core.db.test.user;

import com.rsatech.core.db.dao.entity.user.UserDo;
import com.rsatech.core.db.dao.impl.user.sql.UserDeleteQueryBuilder;
import com.rsatech.core.db.dao.impl.user.sql.UserInsertQueryBuilder;
import com.rsatech.core.db.dao.impl.user.sql.UserSelectQueryBuilder;
import com.rsatech.core.db.dao.impl.user.sql.UserUpdateQueryBuilder;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import com.rsatech.core.shared.filter.user.UserFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.util.Date;

public class UserProfileTest {
    private static final Logger logger = LoggerFactory.getLogger(UserProfileTest.class);
    public static void main(String[] args) {
        UserProfileTest obj = new UserProfileTest();
        //obj.testSelect();
        //obj.testUpdate();
       // obj.testDelete();
        obj.testAdd();
    }

    public void testSelect()
    {
        UserFilter filter = new UserFilter();
        filter.setUserId(66);
        filter.setLoginId("9819440106");
        UserSelectQueryBuilder queryBuilder = new UserSelectQueryBuilder();
        queryBuilder.setFilter(filter);
        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }

    public void testUpdate()
    {
        UserFilter filter = new UserFilter();
        filter.setUserId(66);
        filter.setLoginId("9819440106");

        UserDo data = new UserDo();
        data.setUserId(66);
        data.setFirstName("TEst");

        UserDo oldData = new UserDo();
        oldData.setUserId(66);
        oldData.setFirstName("TEstr");

        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId(88);
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


        UserDo data = new UserDo();
        data.setUserId(66);
        data.setFirstName("TEst");


        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId(88);
        actionDto.setActionTs(new Timestamp(new Date().getTime()));


        UserDeleteQueryBuilder queryBuilder = new UserDeleteQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(actionDto);

        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }

    public void testAdd()
    {


        UserDo data = new UserDo();
        data.setUserId(66);
        data.setFirstName("TEst");


        CoreActionBaseDto actionDto = new CoreActionBaseDto();
        actionDto.setActionId(1);
        actionDto.setUserId(88);
        actionDto.setActionTs(new Timestamp(new Date().getTime()));


        UserInsertQueryBuilder queryBuilder = new UserInsertQueryBuilder();
        queryBuilder.setData(data);
        queryBuilder.setAction(actionDto);

        String query = queryBuilder.build();
        logger.info("SQL: [{}]",query);
    }
}
