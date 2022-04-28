package com.dafeng.dao;

import com.dafeng.bean.Bookroom;
import com.dafeng.bean.BookroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookroomMapper {
    long countByExample(BookroomExample example);

    int deleteByExample(BookroomExample example);

    int deleteByPrimaryKey(Integer bookroomId);

    int insert(Bookroom record);

    int insertSelective(Bookroom record);

    List<Bookroom> selectByExample(BookroomExample example);

    Bookroom selectByPrimaryKey(Integer bookroomId);

    int updateByExampleSelective(@Param("record") Bookroom record, @Param("example") BookroomExample example);

    int updateByExample(@Param("record") Bookroom record, @Param("example") BookroomExample example);

    int updateByPrimaryKeySelective(Bookroom record);

    int updateByPrimaryKey(Bookroom record);
}