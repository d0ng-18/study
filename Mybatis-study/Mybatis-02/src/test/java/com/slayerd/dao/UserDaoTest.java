package com.slayerd.dao;

import com.slayerd.pojo.User;
import com.slayerd.utils.SqlFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    private static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test() {
        SqlSession sqlSession = null;
        sqlSession = SqlFactoryUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        //对数据库进行增删改操作，需要进行事务提交操作
        sqlSession.commit();
        sqlSession.close();
    }
}
