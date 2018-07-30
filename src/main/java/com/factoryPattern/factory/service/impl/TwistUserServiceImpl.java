package com.factoryPattern.factory.service.impl;

import com.factoryPattern.factory.model.UserEntity;
import com.factoryPattern.factory.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class TwistUserServiceImpl implements UserService<UserEntity> {

    @Override
    public UserEntity findAllUser() {
        return new UserEntity(1, "twistName!");
    }

    @Override
    public UserEntity findUserById(long userId) {
        return new UserEntity( 1, "twistFromFindById");
    }
}
