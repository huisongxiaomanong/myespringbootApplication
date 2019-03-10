package com.dahan.myespringboot;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.dahan.myespringboot.dao")
public class MyespringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyespringbootApplication.class, args);
	}

}
