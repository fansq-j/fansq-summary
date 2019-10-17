package com.andrew.config.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


/**
 * 
 * @author fansq 19/7/29
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class ReservationServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ReservationServiceApplication.class).run(args);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
	c.setIgnoreUnresolvablePlaceholders(true);
	return c;
	}
	
}

