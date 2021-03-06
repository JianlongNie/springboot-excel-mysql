package com.smile.controller;

import com.smile.pojo.User;
import com.smile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryUserList")
    public List<User> getUserList(){
        List<User> users = userService.queryUserList();
        for (User user: users){
            System.out.println(user);
        }
        return users;

    }

}
