package com.spring.jpa.demo.service;

import com.spring.jpa.demo.model.UserInfo;
import com.spring.jpa.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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

//    public UserInfo updateUserById(long id){
//        UserInfo u = userInfoRepository.findById(id);
//        u.setAccount("lan");
//        return userInfoRepository.save(u);
//    }
    public UserInfo updateUserByName(String name){
        UserInfo u = userInfoRepository.findByName(name);
        u.setAccount("lan");
        return userInfoRepository.save(u);
    }
    public UserInfo updateUserById(long id,UserInfo userInfo){
        Optional<UserInfo> u = userInfoRepository.findById(id);
        // u.setName(name)
        // u = userInfo;
        if(u.isPresent()){
            System.out.println("此人存在于用户列表中！");
            userInfo.setId(id);
        }else{
            System.out.println("查无此人");
        }
        return  userInfoRepository.save(userInfo);
    }
}
