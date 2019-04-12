package com.spring.jpa.demo.model;

import javax.persistence.*;


@Entity
@Table(name = "AUTH_USER")
public class UserInfo {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACCOUNT")
    private String account;

    @Column(name = "PASSWORD")
    private String password;

    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAccount(){return account;}
    public void setAccount(String account){this.account = account;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password = password;}

    public String toString(){
        return this.id+" "+this.name+" "+this.account+" "+this.password;
    }
}
