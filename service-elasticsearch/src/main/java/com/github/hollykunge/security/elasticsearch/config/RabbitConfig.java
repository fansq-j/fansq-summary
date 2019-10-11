package com.github.hollykunge.security.elasticsearch.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	//声明两个队列，一个交换机
    public static final String TOPIC_QUEUE1 = "topic.one";
    public static final String TOPIC_QUEUE2 = "topic.two";
    public static final String TOPIC_EXCHANGE = "top.exchange";

    @Bean
    public Queue topicQueue1(){
        return new Queue(TOPIC_QUEUE1);
    }

    @Bean
    public Queue topicQueue2(){
        return new Queue(TOPIC_QUEUE2);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE);
    }
   //将两个队列分别绑定到交换机上
    @Bean
    public Binding topBinding1(){
        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with("topic.one");
    }
    @Bean
    public Binding topBinding2(){
        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic.two");
    }
}
