package com.slayerd09.service.impl;

import com.slayerd09.service.TestService;
import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    @Override
    public void add() {
        System.out.println("增加数据");
    }

    @Override
    public void delete() {
        System.out.println("删除数据");
    }

    @Override
    public void update() {
        System.out.println("更新数据");
    }

    @Override
    public void select() {
        System.out.println("查询数据");
    }
}
