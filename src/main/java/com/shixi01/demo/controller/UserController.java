package com.shixi01.demo.controller;

import com.shixi01.demo.po.User;
import com.shixi01.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public List<User> getUserList(){
        return userService.selectUserList();
    }
    @RequestMapping("/work")
    public List<User> getWorkList(){return userService.selectWorkList();}
}
