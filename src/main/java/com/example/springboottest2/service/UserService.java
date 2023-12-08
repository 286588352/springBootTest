package com.example.springboottest2.service;

import java.util.List;

import com.example.springboottest2.entity.User;

/**
 * @Author SS
 * @Date 2021/1/23 9:42
 * @Version 1.0
 */
public interface UserService {
    List<User> query();

    User selectByPrimaryKey(Integer id);

    void insertUser(User user);
}
