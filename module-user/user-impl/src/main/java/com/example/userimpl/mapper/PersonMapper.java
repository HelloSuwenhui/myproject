package com.example.userimpl.mapper;

import com.example.userInterface.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {

    User queryById(@Param("id") int id);
}
