package com.microservice.microservicesimpleprovideruser.Dao;
import com.microservice.microservicesimpleprovideruser.entity.User;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public  interface UserMapper {
    User getUserById(String id);
}
