package com.bridge.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @EnableDiscoveryClient는 spring-cloud-commons에 의존하고 클래스 경로를 통해 구현됩니다.
 * @EnableEurekaClient는 spring-cloud-netflix에 의존하고 eureka에서만 작동합니다.
 * eureka가 classpath에 있다면, 이 둘은 사실상 같습니다.
 * @EnableDiscoveryClient를 구현해서 상품화 시켜놓은 것이 @EnableEurekaServer입니다.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
