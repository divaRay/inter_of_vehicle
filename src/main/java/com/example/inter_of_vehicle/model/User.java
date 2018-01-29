package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/17.
 */
public class User {
    private Integer uid;
    private String uname;
    private String account;
    private String password;
    private String gender;
    private Date birth;
    private Date createTime;
    private Date updateTime;

    public User(){

    }

    public User(Integer uid,String uname,String account,String password,String gender){
          this.uid = uid;
          this.uname = uname;
          this.account = account;
          this.password = password;
          this.gender = gender;
    }

    public Integer getUid(){
        return uid;
    }

    public void setUid(Integer uid){
        this.uid = uid;
    }

    public String getUname(){
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}