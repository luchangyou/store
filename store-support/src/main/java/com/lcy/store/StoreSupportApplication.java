package com.lcy.store;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableDubbo
public class StoreSupportApplication {

	public static void main(String[] args) {

		SpringApplication.run(StoreSupportApplication.class, args);

		System.out.println("启动成功");
	}

}
