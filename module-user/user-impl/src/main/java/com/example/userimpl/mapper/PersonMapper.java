package com.example.userimpl.mapper;

import com.example.userInterface.po.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PersonMapper {

    Person queryById(@Param("id") int id);
}
