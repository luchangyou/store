package com.lcy.store;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lcy.store.mapper")
public class StoreSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreSupportApplication.class, args);
	}

}
