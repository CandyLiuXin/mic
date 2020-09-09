package com.microservice.microserviceauto2provider.Authorization.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.microservice.microserviceauto2provider.Authorization.Mapper.CtUserMapper;
import com.microservice.microserviceauto2provider.Authorization.Service.IctUserService;
import com.microservice.microserviceauto2provider.Authorization.entity.CtUser;

import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Pandong
 * @since 2019-03-05
 */
@Service
public class CtUserServiceImpl extends ServiceImpl<CtUserMapper, CtUser> implements IctUserService {
    
}
