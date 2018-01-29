package com.example.inter_of_vehicle.dao;

import com.example.inter_of_vehicle.model.Maintain;


/**
 * Created by 小年 on 2018/1/18.
 */
public interface MaintainDao {

    public Maintain select(Long vid);

    public Maintain selectByVname(String vname);

    public int insert(String vname, Integer motor_num, Integer rfrequency,
                      Integer mfrequency, Integer rtime,Integer mtime);

    public Maintain deleteByVname(String vname);
}
