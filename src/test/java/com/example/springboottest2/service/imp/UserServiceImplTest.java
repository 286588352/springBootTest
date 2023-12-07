package com.example.springboottest2.service.imp;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.springboottest2.mapper.UserMapper;

/**
 * @BelongsProject: springBootTest
 * @BelongsPackage: com.example.springboottest2.service.imp
 * @Author: 邵帅
 * @CreateTime: 2023-12-07
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void query() {
        userMapper.query();
    }
}