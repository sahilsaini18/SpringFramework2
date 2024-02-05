package com.sahil.springboot.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Learned use of requestmapping and controller
 * 
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.sahil.springboot.myfirstwebapp.login" })
public class MyfirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebappApplication.class, args);
	}

}
