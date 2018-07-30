package com.factoryPattern.factory.factory;

import com.factoryPattern.factory.service.UserService;
import com.factoryPattern.factory.service.impl.PiqUserServiceImpl;
import com.factoryPattern.factory.service.impl.TwistUserServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFactory {

    public UserService getUserServiceImpl(String serviceName){

        switch (serviceName.toLowerCase()) {
            case "piq":  return new PiqUserServiceImpl();

            case "twist":  return new TwistUserServiceImpl();

            default: return new PiqUserServiceImpl();
        }


    }

}
