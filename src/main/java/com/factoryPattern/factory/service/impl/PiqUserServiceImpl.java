package com.factoryPattern.factory.service.impl;

import com.factoryPattern.factory.model.UserDto;
import com.factoryPattern.factory.service.UserService;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Service
public class PiqUserServiceImpl implements UserService<UserDto> {

    @Override
    public UserDto findAllUser() {
        return new UserDto(1,"piqName!");
    }


    @Description("not implemented on this service")
    @Override public UserDto findUserById(long userId) {return null;}
}
