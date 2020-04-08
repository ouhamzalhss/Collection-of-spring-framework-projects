package com.ouhamza.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ouhamza.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FourtuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public ICoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
