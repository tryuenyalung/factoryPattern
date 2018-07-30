package com.factoryPattern.factory.service;

public interface UserService<T>  {

    public T findAllUser();
    public T findUserById(long userId);
}
