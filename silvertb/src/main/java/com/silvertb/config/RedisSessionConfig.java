package com.silvertb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Administrator on 2018/9/4.
 */

@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
