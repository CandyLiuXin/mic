package com.microservice.microserviceauto2provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//对外开启暴露获取token的API接口
@EnableResourceServer
@EnableEurekaClient
@MapperScan("com.microservice.microserviceauto2provider.Authorization.Mapper")
public class MicroserviceAuto2ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAuto2ProviderApplication.class, args);
	}

}
