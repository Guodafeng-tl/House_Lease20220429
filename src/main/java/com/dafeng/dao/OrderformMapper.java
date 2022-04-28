package com.dafeng.dao;

import com.dafeng.bean.Orderform;
import com.dafeng.bean.OrderformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderformMapper {
    long countByExample(OrderformExample example);

    int deleteByExample(OrderformExample example);

    int deleteByPrimaryKey(Integer orderfromId);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    List<Orderform> selectByExample(OrderformExample example);

    Orderform selectByPrimaryKey(Integer orderfromId);

    int updateByExampleSelective(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByExample(@Param("record") Orderform record, @Param("example") OrderformExample example);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}