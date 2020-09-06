package com.microservice.microservicesimpleprovideruser.Controller;


import com.microservice.microservicesimpleprovideruser.Mapper.CtUserMapper;
import com.microservice.microservicesimpleprovideruser.entity.CtUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private CtUserMapper userMapper;

    @GetMapping("/{id}")
    public CtUser findById(@PathVariable String id){
        CtUser user = this.userMapper.selectById(id);
        return user;
    }
}
