package com.xju.mapper;

import com.xju.pojo.Me;

import java.util.List;

public interface UserMapper {
    int insertInfo(Me me);
    List<Me> selectAll();
}
