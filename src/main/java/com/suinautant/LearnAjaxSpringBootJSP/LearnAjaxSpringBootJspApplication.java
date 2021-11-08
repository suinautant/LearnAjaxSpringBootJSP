package com.suinautant.LearnAjaxSpringBootJSP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.suinautant.LearnAjaxSpringBootJSP.object.Quote;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LearnAjaxSpringBootJspApplication {

	private static final Logger log = LoggerFactory.getLogger(LearnAjaxSpringBootJspApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnAjaxSpringBootJspApplication.class, args);
		System.out.println("##### HELLO SPRING BOOT MAIN");
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
			log.info(quote.toString());
		};
	}

}
