package com.msg.entity;

import java.io.Serializable;

public class UserMenu implements Serializable {
    private static final long serialVersionUID = -7579804886594813945L;
    private Long id;

    private Long userId;

    private Long menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}