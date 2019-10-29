package com.fansq.github.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fansq.github.entity.User;
import com.fansq.github.tool.Idempotent;

@RestController
public class DemoController {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	@PostMapping("/redis")
	@Idempotent(value = "/redis", expireMillis = 5000L)
	public String redis(@RequestBody User user) {
		return "redis access ok:" + user.getName() + " " + user.getAge();
	}
}
