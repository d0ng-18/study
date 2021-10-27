package com.slayerd3.service.impl;

import com.slayerd3.dao.UserMapper;
import com.slayerd3.pojo.User;
import com.slayerd3.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {

    @Override
    public List<User> getUsers() {
        User user = new User();
        user.setUserName("宋雨东");
        user.setId(6);
        user.setPwd("123123");

        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(6);
        List<User> users = mapper.getUsers();
        return users;
    }
}
