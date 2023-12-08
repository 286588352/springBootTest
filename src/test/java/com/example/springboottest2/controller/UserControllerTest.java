package com.example.springboottest2.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.springboottest2.service.UserService;

/**
 * @BelongsProject: springBootTest
 * @BelongsPackage: com.example.springboottest2.controller
 * @Author: 邵帅
 * @CreateTime: 2023-12-06
 * @Description: TODO
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private UserService userService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void userMapping() throws Exception {
        String content = "{\"name\":\"pj_mike\",\"password\":\"123456\",\"id\":\"3\"}";
        mockMvc.perform(MockMvcRequestBuilders.request(HttpMethod.POST, "/user")
                        .contentType("application/json").content(content))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("ok"));
    }

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