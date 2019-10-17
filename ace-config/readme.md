fansq 19-8-23
===================
关于配置中心client配置说明
--------------------

1.添加bootstrap.yml文件，具体内容如下

		  eureka:
		    client:
		        serviceUrl:
		            default-Zone: 修改为项目的eurake的注册中心地址
		  management:
		    endpoints:
		        web:
		            exposure:
		                include: bus-refresh
		  spring:
		    cloud:
		      bus:
		        id: ${spring.application.name}:${spring.cloud.config.profile}:${random.value}
		        config:
		            discovery:
		                enabled: true
		                serviceId: config-server
		            fail-fast: true
		            label: 分支名称 例如：master  
		            name: 想要获取的配置文件名称多个可以用逗号隔开 例如：qwer,address
		            profile: 对应环境dev-开发环境  prod-生产环境 test-测试环境   例如：dev
		            
2.添加如下jar包

		<dependencies>
			<dependency>
			  <groupId>org.springframework.cloud</groupId>
			  <artifactId>spring-cloud-starter-config</artifactId>
			</dependency>
		    <dependency>
	            <groupId>org.springframework.cloud</groupId>
	            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
	        </dependency>
	        <dependency>
	            <groupId>org.springframework.boot</groupId>
	            <artifactId>spring-boot-starter-actuator</artifactId>
	        </dependency>
	        <dependency>
		      <groupId>org.springframework.boot</groupId>
		      <artifactId>spring-boot-starter-web</artifactId>
		    </dependency>
			<dependency>
			  <groupId>org.springframework.cloud</groupId>
			  <artifactId>spring-cloud-starter-bus-amqp</artifactId>
			</dependency>
	 		<dependency>
	            <groupId>org.springframework.cloud</groupId>
	            <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
	        </dependency>
			<dependency>
	            <groupId>org.springframework.cloud</groupId>
	            <artifactId>spring-cloud-bus</artifactId>
	        </dependency>
		 </dependencies>
	 
3.在获取配置信息的类上添加@RefreshScope注解，用于实时刷新

4.通过@Value注解获取配置文件的具体内容 例如 @Value("${eureka.client.serviceUrl.defaultZone}")    