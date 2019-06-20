package com.java.serviceImpl;

import com.java.service.AopService;
import org.springframework.stereotype.Service;

@Service("aopService")
public class AopServiceImpl implements AopService {
    @Override
    public void add() {
        System.out.println("增加......");
    }

    @Override
    public void delete() {
        System.out.println("删除......");
    }

    @Override
    public void update() {
        System.out.println("修改......");
    }

    @Override
    public void query() {
        System.out.println("查询......");
    }
}
