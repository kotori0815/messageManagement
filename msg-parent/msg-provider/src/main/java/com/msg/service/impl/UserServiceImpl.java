package com.msg.service.impl;

import com.msg.entity.Menu;
import com.msg.entity.User;
import com.msg.mapper.UserMapper;
import com.msg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wd on 2018/3/8.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByid(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<Menu> selectMenuByUserId(Long userId) {
        return null;
    }
}
