package com.dafeng.dao;

import com.dafeng.bean.Dictionary;
import com.dafeng.bean.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    long countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(DictionaryExample example);

    Dictionary selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}