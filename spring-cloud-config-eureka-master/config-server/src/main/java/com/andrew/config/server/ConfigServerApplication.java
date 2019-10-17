package com.andrew.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.env.PropertiesPropertySourceLoader;
import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * fansq 19-7-29
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerApplication.class).run(args);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
	c.setIgnoreUnresolvablePlaceholders(true);
	return c;
	}
	
	@Bean
	public static PropertySourceLoader getPropertiesPropertySourceLoader () {
		NewPropertySourcesPlaceholderConfigurer nspc= 
				new NewPropertySourcesPlaceholderConfigurer();
		return nspc;
	}
}
