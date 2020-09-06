package com.microservice.microserviceeurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication    //    spring-boot启动注解
@EnableEurekaServer        //    eureka组件服务注解
@EnableAutoConfiguration
public class MicroserviceEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceEurekaProviderApplication.class, args);
	}

}
