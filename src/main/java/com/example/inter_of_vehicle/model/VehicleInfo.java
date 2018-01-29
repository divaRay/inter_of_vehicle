package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/17.
 */
public class VehicleInfo {

    private Long vid;
    private String vname;
    private String brand;
    private String vtype;
    private Integer motor_num;
    private String other;
    private Date createTime;
    private Date updateTime;

    public VehicleInfo(){

    }

    public VehicleInfo(Long vid,String vname,String brand,String vtype,Integer motor_num,String other ){

    }

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public Integer getMotor_num() {
        return motor_num;
    }

    public void setMotor_num(Integer motor_num) {
        this.motor_num = motor_num;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
