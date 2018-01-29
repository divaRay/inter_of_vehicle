package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public class Maintain {

    private Integer vid;
    private String vname;
    private Integer motor_num;
    private Integer rfrequency;
    private Integer mfrequency;
    private Integer rtime;
    private Integer mtime;
    private Date createTime;
    private Date updateTime;

    public Maintain(){

    }
    public Maintain(Integer vid,String vname,Integer motor_num,Integer rfrequency,
                    Integer mfrequency,Integer rtime,Integer mtime){

    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Integer getMotor_num() {
        return motor_num;
    }

    public void setMotor_num(Integer motor_num) {
        this.motor_num = motor_num;
    }

    public Integer getRfrequency() {
        return rfrequency;
    }

    public void setRfrequency(Integer rfrequency) {
        this.rfrequency = rfrequency;
    }

    public Integer getMfrequency() {
        return mfrequency;
    }

    public void setMfrequency(Integer mfrequency) {
        this.mfrequency = mfrequency;
    }

    public Integer getRtime() {
        return rtime;
    }

    public void setRtime(Integer rtime) {
        this.rtime = rtime;
    }

    public Integer getMtime() {
        return mtime;
    }

    public void setMtime(Integer mtime) {
        this.mtime = mtime;
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

