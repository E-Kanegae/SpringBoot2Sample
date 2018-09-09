package com.example.ek.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class SpringSessionConfig {
	
	@Bean
	public JedisConnectionFactory connectionFactory() {
		  RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
		  redisStandaloneConfiguration.setHostName("192.168.99.100");
		  redisStandaloneConfiguration.setPort(6379);
		  return new JedisConnectionFactory(redisStandaloneConfiguration);
	}

}
