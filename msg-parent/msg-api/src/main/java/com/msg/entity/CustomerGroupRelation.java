package com.msg.entity;

import java.io.Serializable;

public class CustomerGroupRelation implements Serializable {
    private static final long serialVersionUID = 3719599332298720260L;
    private Long id;

    private Long customerId;

    private Long groupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}