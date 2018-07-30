package com.factoryPattern.factory.controller;

import com.factoryPattern.factory.factory.UserServiceFactory;
import com.factoryPattern.factory.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    private UserServiceFactory userServiceFactory;
    private UserService userService;

    public UserController(UserServiceFactory userServiceFactory) {
        this.userServiceFactory = userServiceFactory;
    }

    @GetMapping("/yuen")
    public ResponseEntity<Object> asd (@RequestParam(value = "type", required = false) String type){

        List<String> validFactory = Arrays.asList("twist","piq");

        if(type == null) {type = "piq";}
        if( validFactory.contains(type.toLowerCase() ) ){
            userService = userServiceFactory.getUserServiceImpl(type);
        }else{
            userService = userServiceFactory.getUserServiceImpl("piq");
        }


        return ResponseEntity.ok( userService.findAllUser() );
    }

    @GetMapping("/yuen1")
    public ResponseEntity<Object> asdf (@RequestParam(value = "type" , required = false) String type){
        List<String> validFactory = Arrays.asList("twist");

        if(type == null) {type = "piq";}

        if( validFactory.contains(type.toLowerCase() ) ){
            userService = userServiceFactory.getUserServiceImpl(type);
        }else{
            userService = userServiceFactory.getUserServiceImpl("twist");
        }


        return ResponseEntity.ok( userService.findUserById(1) );
    }




}
