package com.example.springboottest2.service;

import com.example.springboottest2.entity.User;

import java.util.List;

/**
 * @Author SS
 * @Date 2021/1/23 9:42
 * @Version 1.0
 */
public interface UserService {
    List<User> query();
}
