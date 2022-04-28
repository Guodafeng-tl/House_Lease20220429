package com.dafeng.dao;

import com.dafeng.bean.Contract;
import com.dafeng.bean.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContractMapper {
    long countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Integer contractId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Integer contractId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}