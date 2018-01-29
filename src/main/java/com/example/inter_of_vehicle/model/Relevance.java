package com.example.inter_of_vehicle.model;

import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public class Relevance {

    private Long vid;
    private String vname;
    private String equipment;
    private Integer total;
    private String binding;
    private Date time;
    private Date createTime;
    private Date updateTime;

    public Relevance(){

    }
    public Relevance(Long vid,String vname,String equipment,Integer total,String binding,Date time){

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

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
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
