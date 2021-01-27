package com.example.springboottest2.controller;

import com.example.springboottest2.entity.User;
import com.example.springboottest2.response.Result;
import com.example.springboottest2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * @Author SS
 * @Date 2021/1/23 9:37
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/query")
    public Result query(){
        List<User> list =userService.query();
        if(Objects.nonNull(list)){
            return Result.OK(list);
        }else return Result.OK("无数据");
    }

}
