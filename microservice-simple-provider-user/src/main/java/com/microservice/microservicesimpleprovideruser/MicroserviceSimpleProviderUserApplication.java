package com.microservice.microservicesimpleprovideruser;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
/**
 * 入口类
 * @title AuthorizeApplication.java
 * @package com.authorize
 * @author Pandong
 * @date 2019年2月22日
 */
@SpringBootApplication
@EnableFeignClients        //    服务之间通信所需注解
@EnableEurekaClient
@MapperScan("com.microservice.microservicesimpleprovideruser.Mapper")
public class MicroserviceSimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
    }

    /**
     * MP分页插件,后面会有说明
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
    
}