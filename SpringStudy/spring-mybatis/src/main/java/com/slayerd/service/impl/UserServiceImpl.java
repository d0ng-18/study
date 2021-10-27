package com.slayerd.service.impl;

import com.slayerd.dao.UserMapper;
import com.slayerd.pojo.User;
import com.slayerd.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

//@Component
public class UserServiceImpl implements UserService {
    //@Autowired
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUsers();
    }
}
