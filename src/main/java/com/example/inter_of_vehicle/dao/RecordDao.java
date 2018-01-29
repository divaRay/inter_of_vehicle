package com.example.inter_of_vehicle.dao;

import com.example.inter_of_vehicle.model.Record;

/**
 * Created by 小年 on 2018/1/18.
 */
public interface RecordDao {

    public Record select(Integer vid);

    public Record selectByVname(String vname);

    public int insert(String vname,Double distance, Double duration, String site);

    public Record deleteByVname(String vname);
}
