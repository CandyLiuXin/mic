package com.microservice.microservicesimpleprovideruser.Controller;


import com.microservice.microservicesimpleprovideruser.Dao.UserMapper;
import com.microservice.microservicesimpleprovideruser.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        User user = this.userMapper.getUserById(id);
        return user;
    }
}
