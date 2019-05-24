package com.java.serviceImpl;

import com.java.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void addusers() {
        System.out.println("增加用户...");
    }
}
