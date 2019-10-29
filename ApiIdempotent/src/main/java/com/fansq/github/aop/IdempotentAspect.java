package com.fansq.github.aop;

import java.lang.reflect.Method;
import java.util.Objects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.fansq.github.exception.IdempotentException;
import com.fansq.github.tool.Idempotent;
import com.fansq.github.untils.KeyUtil;

import redis.clients.jedis.JedisCommands;

@Component
@Aspect
@ConditionalOnClass(RedisTemplate.class)
public class IdempotentAspect {
	private static final String KEY_TEMPLATE = "idempotent_%s";
 
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
 
	// @annotation中包路径根据实际填写
	@Pointcut("@annotation(com.fansq.github.tool.Idempotent)")
	public void executeIdempotent() {
 
	}
 
	@Around("executeIdempotent()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
		Idempotent idempotent = method.getAnnotation(Idempotent.class);
		String key = String.format(KEY_TEMPLATE,
				idempotent.value() + "_" + KeyUtil.generate(method, joinPoint.getArgs()));
		String redisRes = redisTemplate
				.execute((RedisCallback<String>) conn -> ((JedisCommands) conn.getNativeConnection()).set(key, key,
						"NX", "PX", idempotent.expireMillis()));
		if (Objects.equals("OK", redisRes)) {
			return joinPoint.proceed();
		} else {
			throw new IdempotentException("Idempotent hits, key=" + key);
		}
	}


}
