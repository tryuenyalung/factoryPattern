package com.factoryPattern.factory.model;

public class UserDto {

    private Integer piqId;
    private String piqName;

    public UserDto(Integer piqId, String piqName) {
        this.piqId = piqId;
        this.piqName = piqName;
    }

    public UserDto() {
    }

    public Integer getPiqId() {
        return piqId;
    }

    public void setPiqId(Integer piqId) {
        this.piqId = piqId;
    }

    public String getPiqName() {
        return piqName;
    }

    public void setPiqName(String piqName) {
        this.piqName = piqName;
    }
}
