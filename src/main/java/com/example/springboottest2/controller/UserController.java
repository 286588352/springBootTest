package com.example.springboottest2.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboottest2.entity.User;
import com.example.springboottest2.response.Result;
import com.example.springboottest2.service.UserService;

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
        }
        return Result.OK("无数据");
    }

    @RequestMapping("/selectByPrimaryKey")
    public Result selectByPrimaryKey(Integer id) {
        User u = userService.selectByPrimaryKey(id);
        return Result.OK(u);
    }

    @RequestMapping("/user")
    public String userMapping(@RequestBody User user) {
        userService.insertUser(user);
        return "ok";
    }
}
