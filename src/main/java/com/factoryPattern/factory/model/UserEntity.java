package com.factoryPattern.factory.model;

public class UserEntity {

    private Integer twistId;
    private String twistName;

    public UserEntity(Integer twistId, String twistName) {
        this.twistId = twistId;
        this.twistName = twistName;
    }

    public UserEntity() {
    }

    public Integer getTwistId() {
        return twistId;
    }

    public void setTwistId(Integer twistId) {
        this.twistId = twistId;
    }

    public String getTwistName() {
        return twistName;
    }

    public void setTwistName(String twistName) {
        this.twistName = twistName;
    }
}
