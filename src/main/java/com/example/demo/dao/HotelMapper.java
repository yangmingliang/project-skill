package com.example.demo.dao;

import com.example.demo.entity.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface HotelMapper {


    @Select("select * from people ")
    List<Map<String,String>> getTest();

}
