package com.microservice.microserviceauto2provider.Authorization.controller;

import java.security.Principal;
import java.util.HashMap;

import com.microservice.microserviceauto2provider.Authorization.Mapper.CtUserMapper;
import com.microservice.microserviceauto2provider.Authorization.entity.CtUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysuser")
public class SysUserController {
    @Autowired
    public CtUserMapper userMapper;


    @GetMapping("getByName")
    public CtUser getByName(){
        HashMap<String,Object> userMap = new HashMap<String,Object>();
        userMap.put("userName","zhangjian");
        return userMapper.selectByMap(userMap).get(0);
    }

    /**
     * 获取授权的用户信息
     * @param principal 当前用户
     * @return 授权信息
     */
    @GetMapping("current/get")
    public Principal user(final Principal principal){
        return principal;
    }
}