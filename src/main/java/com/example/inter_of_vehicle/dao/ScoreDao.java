package com.example.inter_of_vehicle.dao;

import com.example.inter_of_vehicle.model.Score;


import java.util.Date;

/**
 * Created by 小年 on 2018/1/18.
 */
public interface ScoreDao {

    public Score select(Long vid);

    public Score selectByVname(String vname);

    public int insert(String vname,Integer motorscore, Integer radiatorscore,
                      Integer intakescore, Integer absolutescore,Integer average);

    public Score deleteByVname(String vname);
}
