package com.dafeng.dao;

import com.dafeng.bean.Eviction;
import com.dafeng.bean.EvictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvictionMapper {
    long countByExample(EvictionExample example);

    int deleteByExample(EvictionExample example);

    int deleteByPrimaryKey(Integer evictionId);

    int insert(Eviction record);

    int insertSelective(Eviction record);

    List<Eviction> selectByExample(EvictionExample example);

    Eviction selectByPrimaryKey(Integer evictionId);

    int updateByExampleSelective(@Param("record") Eviction record, @Param("example") EvictionExample example);

    int updateByExample(@Param("record") Eviction record, @Param("example") EvictionExample example);

    int updateByPrimaryKeySelective(Eviction record);

    int updateByPrimaryKey(Eviction record);
}