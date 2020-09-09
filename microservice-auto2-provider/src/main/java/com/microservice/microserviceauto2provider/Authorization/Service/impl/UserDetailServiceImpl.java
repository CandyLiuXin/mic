package com.microservice.microserviceauto2provider.Authorization.Service.impl;

import java.util.HashMap;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.microservice.microserviceauto2provider.Authorization.Mapper.CtUserMapper;
import com.microservice.microserviceauto2provider.Authorization.entity.CtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private CtUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        // 获取本地用户
        HashMap<String, Object> userMap = new HashMap<String, Object>();
        userMap.put("userName", userName);
        QueryWrapper<CtUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userName", userName);
        CtUser user = userMapper.selectOne(queryWrapper);
        if(user != null){
            //返回oauth2的用户
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(),
                    user.getPassWord(),
                    AuthorityUtils.createAuthorityList(user.getRole())) ;
        }else{
            throw  new UsernameNotFoundException("用户["+userName+"]不存在");
        }
    }
}