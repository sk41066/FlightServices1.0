package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
@Bean
public UserService UserServcie(){
	return new UserService();
}
	
}
