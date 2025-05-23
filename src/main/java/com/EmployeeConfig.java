package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="com")
@EnableWebMvc
public class EmployeeConfig {
	
	@Bean
	public ViewResolver getViewResolver() {
		
		InternalResourceViewResolver i = new InternalResourceViewResolver();
		i.setPrefix("/WEB-INF/views/");
		i.setSuffix(".jsp");
		
		return i;
		
		
	}
	

	

	

	
}
