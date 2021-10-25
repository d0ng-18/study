package com.slayerd.dao;

import com.slayerd.pojo.User;
import com.slayerd.utils.SqlFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlFactoryUtil.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> user = mapper.getUserList();
            for (User element:user) {
                System.out.println(element.toString());
            }

            User user1 = mapper.getUser(1);
            System.out.print("用户id对应的数据为：" + user1.toString());
            User element = new User();
            element.setId(5);
            element.setUserName("adc");
            element.setPassword("1234567");
            int i = mapper.insertUser(element);
            //mapper.updateUser(4);
            if(i>0){
                System.out.println("操作数据库成功（插表操作）");
            }
        }catch (Exception e){

        }finally {
            //对数据库进行增删改操作，需要进行事务提交操作
            sqlSession.commit();
            sqlSession.close();
        }

    }

@Test
    public void test1(){
        SqlSession sqlSession = SqlFactoryUtil.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.updateUser(4);
            if(i > 0){
                System.out.println("操作数据库成功");
                //对数据库进行增删改操作，需要进行事务提交操作
                sqlSession.commit();
            }
        }catch (Exception e){

        }finally {
            sqlSession.close();
        }

    }
    @Test
    public void test2(){
        SqlSession sqlSession=null;
        try {
            sqlSession = SqlFactoryUtil.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.deleteUser(1);
            if(i > 0){
                System.out.println("操作数据库成功");
                //对数据库进行增删改操作，需要进行事务提交操作
                sqlSession.commit();
            }
        }catch (Exception e){

        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void test3(){
        SqlSession sqlSession=null;
        try {
            sqlSession = SqlFactoryUtil.getSqlSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userLikeList = mapper.getUserLikeList("王");
            for (User user : userLikeList) {
                System.out.println(user.toString());
            }
        }catch (Exception e){

        }finally {
            sqlSession.close();
        }

    }
}
