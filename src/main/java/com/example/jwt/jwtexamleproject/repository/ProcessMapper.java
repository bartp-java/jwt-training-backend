package com.example.jwt.jwtexamleproject.repository;

import com.example.jwt.jwtexamleproject.model.DHSProcess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProcessMapper {

    @Select("select * from processes")
    List<DHSProcess> findAll();

}
