/**
 * 
 */
package com.proshanto.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.proshanto.spring.service.Person;

/**
 * @author proshanto
 */

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.proshanto.service")
public class BeanConfig {
	
	@Bean
	public Person person() {
		return new Person();
	}
	
}
