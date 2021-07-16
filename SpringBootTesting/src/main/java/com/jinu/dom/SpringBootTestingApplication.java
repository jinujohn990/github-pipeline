package com.jinu.dom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableAsync
//@EnableScheduling
//@EnableFeignClients
@EnableZuulProxy
public class SpringBootTestingApplication {

	public static void main(String[] args) {
		try {
		SpringApplication.run(SpringBootTestingApplication.class, args);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}
