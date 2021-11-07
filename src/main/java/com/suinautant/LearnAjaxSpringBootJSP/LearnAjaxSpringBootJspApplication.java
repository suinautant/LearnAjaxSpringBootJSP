package com.suinautant.LearnAjaxSpringBootJSP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LearnAjaxSpringBootJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnAjaxSpringBootJspApplication.class, args);
		System.out.println("##### HELLO SPRING BOOT MAIN");
	}

}
