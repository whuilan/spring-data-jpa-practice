package com.spring.jpa.demo.controller;

import com.spring.jpa.demo.model.UserInfo;
import com.spring.jpa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/say/{name}")
    public String  sayHello(@PathVariable String name){
        return "Hello,"+name;
    }

    @PostMapping("/addUser")
    public UserInfo saveUser(@RequestBody UserInfo userInfo){
        return userService.saveOneUser(userInfo);
    }

    @RequestMapping(value = "/oneUser")
    public UserInfo findOneUser(@RequestParam String userName){
        return userService.findOneUserByName(userName);
    }

    @RequestMapping(value = "/someUsers")
    public List<UserInfo> findSomeUsers(@RequestParam String pwd){
        return userService.findAllUsersByTheirPassword(pwd);
    }

    @RequestMapping(value = "/deleteOneUser")
    public void deleteUser(Long id){
        userService.deleteUserById(id);
    }

    @RequestMapping(value = "/deleteByName")
    public void deleteUserByName(String name){
        userService.deleteUerByName(name);
    }

    @RequestMapping(value = "/deleteByAccount")
    public void deleteUserByAccount(String account){
        userService.deleteUerByAccount(account);
    }
}

