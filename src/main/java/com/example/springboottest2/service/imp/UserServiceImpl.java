package com.example.springboottest2.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboottest2.entity.User;
import com.example.springboottest2.mapper.UserMapper;
import com.example.springboottest2.service.UserService;

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

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}
