package com.example.springboottest2.service.imp;

import com.example.springboottest2.entity.User;
import com.example.springboottest2.mapper.UserMapper;
import com.example.springboottest2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author SS
 * @Date 2021/1/23 9:43
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> query() {
        return userMapper.query();
    }
}
