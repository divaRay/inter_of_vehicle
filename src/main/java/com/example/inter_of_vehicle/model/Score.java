package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public class Score {
    private Long vid;
    private String vname;
    private Integer motorscore;
    private Integer radiatorscore;
    private Integer intakescore;
    private Integer absolutescore;
    private Integer average;
    private Date time;
    private Date createTime;
    private Date updateTime;

    public Score() {

    }

    public Score(Long vid, String vname, Integer motorscore, Integer radiatorscore,
                 Integer intakescore, Integer absolutescore, Integer average) {

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

    public Integer getMotorscore() {
        return motorscore;
    }

    public void setMotorscore(Integer motorscore) {
        this.motorscore = motorscore;
    }

    public Integer getRadiatorscore() {
        return radiatorscore;
    }

    public void setRadiatorscore(Integer radiatorscore) {
        this.radiatorscore = radiatorscore;
    }

    public Integer getIntakescore() {
        return intakescore;
    }

    public void setIntakescore(Integer intakescore) {
        this.intakescore = intakescore;
    }

    public Integer getAbsolutescore() {
        return absolutescore;
    }

    public void setAbsolutescore(Integer absolutescore) {
        this.absolutescore = absolutescore;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
