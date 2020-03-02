package com.team02.template.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.team02.template.interceptor.CommonInterceptor;
import com.team02.template.interceptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	private CommonInterceptor commonInterceptor;
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(commonInterceptor).addPathPatterns("/**")
		.excludePathPatterns("/").excludePathPatterns("/css/**")
		.excludePathPatterns("/boardcss/**").excludePathPatterns("/dist/**")
		.excludePathPatterns("/img/**").excludePathPatterns("/js/**")
		.excludePathPatterns("/plugins/**").excludePathPatterns("/src/**").excludePathPatterns("/xeicon/**");
		
		/*
		 * registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
		 * .excludePathPatterns("/mInsert").excludePathPatterns("/login")
		 * .excludePathPatterns("/").excludePathPatterns("/boardcss/**")
		 * .excludePathPatterns("/dist/**").excludePathPatterns("/xeicon/**")
		 * .excludePathPatterns("/img/**").excludePathPatterns("/js/**")
		 * .excludePathPatterns("/plugins/**").excludePathPatterns("/src/**");
		 */
		
		
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
	
}
