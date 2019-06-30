package com.example.artem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.example.artem.mapper.UserMapper;
import com.example.artem.table.User;


@SpringBootApplication
public class ArtemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtemApplication.class, args);
	}
	
	private final UserMapper userMapper;
	
	public ArtemApplication(UserMapper userMapper) {
		this.userMapper = userMapper; //Mapperをインジェクションする
	}
	

	

}
