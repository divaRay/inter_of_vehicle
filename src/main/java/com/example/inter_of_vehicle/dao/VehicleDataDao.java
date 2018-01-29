package com.example.inter_of_vehicle.dao;


import com.example.inter_of_vehicle.model.VehicleData;


/**
 * Created by 小年 on 2018/1/18.
 */
public interface  VehicleDataDao {

    public VehicleData select(Long vid);
    public VehicleData selectByVname(String vname);

    public int insert(String vname,Integer motortemp, Integer motorspeed,Integer motorload,
                      Integer radiator_temp,Integer absolute_pressure, Integer intake_temp,
                      Integer intake_airflow);

    public VehicleData update(String vname,Integer motortemp, Integer motorspeed, Integer motorload,
                              Integer radiator_temp,Integer absolute_pressure, Integer intake_temp,
                              Integer intake_airflow);

    public VehicleData deleteByVname(String vname);
}
