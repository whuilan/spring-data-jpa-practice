package com.spring.jpa.demo.service;

import com.spring.jpa.demo.model.UserInfo;
import com.spring.jpa.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    UserInfoRepository userInfoRepository;

    public UserInfo saveOneUser(UserInfo userInfo){
        return userInfoRepository.save(userInfo);
    }

    public UserInfo findOneUserByName(String name){
        return userInfoRepository.findByName(name);
    }

    public List<UserInfo> findAllUsersByTheirPassword(String pwd){
        return userInfoRepository.findAllByPassword(pwd);
    }

    public void deleteUserById(Long id){
        userInfoRepository.deleteById(id);
    }

    public void deleteUerByName(String name){
        userInfoRepository.deleteByName(name);
    }

    public void deleteUerByAccount(String account){
        userInfoRepository.deleteByAccount(account);
    }
}
