package com.ground.dating.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GroundApp {
	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(GroundApp.class, args);
				//SpringApplication.run(SpringBootTutorialBasicsApplication.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		
	}
}
