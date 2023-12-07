package com.example.springboottest2.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboottest2.service.UserService;

/**
 * @BelongsProject: springBootTest
 * @BelongsPackage: com.example.springboottest2.controller
 * @Author: 邵帅
 * @CreateTime: 2023-12-06
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserService userService;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void query() {
        userService.query();
    }

    @Test
    void selectByPrimaryKey() {
        userService.selectByPrimaryKey(1);
    }
}