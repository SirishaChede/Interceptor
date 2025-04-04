package com.example.demo.RestAPI.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.RestAPI.Interceptor.RequestInterceptor;
@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RequestInterceptor())
		        .addPathPatterns("/api/**")
		        .excludePathPatterns("/api/auth/***");
	}

}
