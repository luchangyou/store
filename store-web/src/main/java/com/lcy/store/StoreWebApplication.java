package com.lcy.store;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class StoreWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(StoreWebApplication.class, args);

		System.out.println("启动成功");
	}

}
