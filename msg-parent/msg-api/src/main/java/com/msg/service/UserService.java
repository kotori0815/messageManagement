package com.msg.service;

import com.msg.entity.Menu;
import com.msg.entity.User;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by wd on 2018/3/8.
 */
public interface UserService {
    User selectUserByid(Long id);
    List<Menu> selectMenuByUserId(Long userId);
}
