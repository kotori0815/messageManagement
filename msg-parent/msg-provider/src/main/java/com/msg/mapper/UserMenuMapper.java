package com.msg.mapper;

import com.msg.entity.UserMenu;

public interface UserMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserMenu record);

    int insertSelective(UserMenu record);

    UserMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserMenu record);

    int updateByPrimaryKey(UserMenu record);
}