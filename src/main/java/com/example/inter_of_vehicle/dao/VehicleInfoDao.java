package com.example.inter_of_vehicle.dao;

import com.example.inter_of_vehicle.model.VehicleInfo;

/**
 * Created by 小年 on 2018/1/18.
 */
public interface VehicleInfoDao {

    public VehicleInfo select(Long vid);

    public VehicleInfo selectByVname(String vname);

    public int insert(String vname, String brand, String vtype, Integer motor_num,
                      String other);

    public VehicleInfo deleteByVname(String vname);

}
