package com.andrew.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

//	@Value("${foo}")
//	private String message;
	
//	@Value("${democonfigclient.message}")
//	private String democonfigclientMessage;
	
//	@Value("${serverport:}")
//	private String democonfigclientMessage;

	@Value("${spring.rabbitmq.host}")
	private String rabbitmqHost;
//	
//	@Value("${eureka.client.serviceUrl.defaultZone}")
//	private String eurekaDefaultZone;
//	
//	@Value("${server.port}")
//	private String serverPort;
	@RequestMapping("/message")
	String getMessage() {
//		return "foo: "+this.message+" rabbitmqHost: "+this.rabbitmqHost
//				+" eurekaDefaultZone: "+this.eurekaDefaultZone
//				+" serverPort: "+this.serverPort;
		
		return "foo: "+rabbitmqHost;
	}
}