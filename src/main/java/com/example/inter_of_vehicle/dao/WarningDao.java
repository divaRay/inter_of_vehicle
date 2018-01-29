package com.example.inter_of_vehicle.dao;


import com.example.inter_of_vehicle.model.Warning;


/**
 * Created by 小年 on 2018/1/18.
 */
public interface WarningDao {

    public Warning select(Long vid);

    public Warning selectByVname(String vname);

    public int insert(String vname, String wname, String type, Integer frequency,
                      Integer total);

    public Warning deleteByVname(String vname);
}
