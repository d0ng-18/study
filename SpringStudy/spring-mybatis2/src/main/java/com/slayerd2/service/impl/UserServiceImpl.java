package com.slayerd2.service.impl;

import com.slayerd2.dao.UserMapper;
import com.slayerd2.pojo.User;
import com.slayerd2.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService{

    @Override
    public List<User> getUsers() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        return users;
    }
}
