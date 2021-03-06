package com.test.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
	@Bean
	public LuckA luckA() {
		LuckA luckA = new LuckA();
		
		return luckA;
	}
	
	@Bean
	public SwimCoach swimCoach() {
		SwimCoach coach = new SwimCoach(luckA());
		
		return coach;
	}
	
}
