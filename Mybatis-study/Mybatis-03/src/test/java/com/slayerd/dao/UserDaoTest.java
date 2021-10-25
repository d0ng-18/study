//package com.slayerd.dao;
//
//import com.slayerd.pojo.User;
//import com.slayerd.utils.SqlFactoryUtil;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import java.util.List;
//
//public class UserDaoTest {
//    @Test
//    public void testGetUsers() {
//        SqlSession sqlSession = null;
//        sqlSession = SqlFactoryUtil.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.getUsers();
//        for (User user : users) {
//            System.out.println(user);
//        }
//        //对数据库进行增删改操作，需要进行事务提交操作
//        //sqlSession.commit();
//        sqlSession.close();
//    }
//
//    @Test
//    public void testGetUser(){
//        SqlSession sqlSession = null;
//        sqlSession = SqlFactoryUtil.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(com.slayerd.dao.UserMapper.class);
//        User adc = mapper.getUser(5, "adc");
//        System.out.println(adc);
//        sqlSession.close();
//    }
//
//    @Test
//    public void testInsertUser(){
//        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        int result = mapper.insertUser(6, "张哲源", "111");
//        if(result == 1){
//            System.out.println("插入成功");
//        }
//        sqlSession.close();
//    }
//}
