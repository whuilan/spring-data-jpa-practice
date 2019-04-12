package com.spring.jpa.demo.repository;

import com.spring.jpa.demo.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByName(String name);
    List<UserInfo> findAllByPassword(String password);

    @Modifying
    @Transactional
    void deleteByName(String name);
    void deleteByAccount(String account);
}
