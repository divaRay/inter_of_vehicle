package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public class Warning {

    private Long vid;
    private String vname;
    private String wname;
    private String type;
    private Integer frequency;
    private Integer total;
    private Date createTime;
    private Date updateTime;

    public Warning(){

    }
    public Warning(Long vid,String vname,String wname,String type,
                   Integer frequency,Integer total){

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

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
