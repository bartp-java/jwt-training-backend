package com.example.jwt.jwtexamleproject.repository;

import com.example.jwt.jwtexamleproject.model.JwtUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JwtUserMapper {

    @Select("select * from users where email = #{email} and password = #{password}")
    List<JwtUser> findByEmailAndPassword(String email, String password);

}
