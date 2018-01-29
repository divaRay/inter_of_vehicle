package com.example.inter_of_vehicle.dao;

import com.example.inter_of_vehicle.model.Relevance;

/**
 * Created by 小年 on 2018/1/18.
 */
public interface RelevanceDao {

    public Relevance select(Long vid);

    public Relevance selectByVname(String vname);

    public int insert(String vname,String equipment, Integer total,String binding);

    public Relevance deleteByVname(String vname);
}
