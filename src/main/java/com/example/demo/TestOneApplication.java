package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.example.demo")
public class TestOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestOneApplication.class, args);
	}
}
