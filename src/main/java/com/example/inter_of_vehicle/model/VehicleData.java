package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public class VehicleData {

    private Long vid;
    private String vname;
    private Integer motortemp;
    private Integer motorspeed;
    private Integer motorload;
    private Integer radiator_temp;
    private Integer absolute_pressure;
    private Integer intake_temp;
    private Integer intake_airflow;
    private Date createTime;
    private Date updateTime;

    public VehicleData(){

    }

    public VehicleData(Long vid,String vname,Integer motortemp,Integer motorspeed,
                       Integer motorload,Integer radiator_temp,Integer absolute_pressure,
                       Integer intake_temp,Integer intake_airflow){

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

    public Integer getMotortemp() {
        return motortemp;
    }

    public void setMotortemp(Integer motortemp) {
        this.motortemp = motortemp;
    }

    public Integer getMotorspeed() {
        return motorspeed;
    }

    public void setMotorspeed(Integer motorspeed) {
        this.motorspeed = motorspeed;
    }

    public Integer getMotorload() {
        return motorload;
    }

    public void setMotorload(Integer motorload) {
        this.motorload = motorload;
    }

    public Integer getRadiator_temp() {
        return radiator_temp;
    }

    public void setRadiator_temp(Integer radiator_temp) {
        this.radiator_temp = radiator_temp;
    }

    public Integer getAbsolute_pressure() {
        return absolute_pressure;
    }

    public void setAbsolute_pressure(Integer absolute_pressure) {
        this.absolute_pressure = absolute_pressure;
    }

    public Integer getIntake_temp() {
        return intake_temp;
    }

    public void setIntake_temp(Integer intake_temp) {
        this.intake_temp = intake_temp;
    }

    public Integer getIntake_airflow() {
        return intake_airflow;
    }

    public void setIntake_airflow(Integer intake_airflow) {
        this.intake_airflow = intake_airflow;
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
