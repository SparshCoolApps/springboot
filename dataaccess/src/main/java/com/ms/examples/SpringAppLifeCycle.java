package com.ms.examples;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringAppLifeCycle {

	
	public static void main(String ...agrs){
		SpringApplication.run(SpringAppLifeCycle.class);
		
	}
	
	
	/**
	 * This method just called once just before SpringApplication.run(…​) completes.
	 * @param ctx
	 * @return
	 */
	@Bean
	@Order(value=1)
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Order 1");
			System.out.println("Let's inspect the beans provided by Spring Boot:");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

		};
	}
	
	/**
	 * This method just called once just before SpringApplication.run(…​) completes.
	 * @param ctx
	 * @return
	 */
	@Bean
	@Order(value=2)
	public CommandLineRunner commandLineRunner2(Environment env) {
		return args -> {

			System.out.println("Order 2");
			System.out.println("Just show Profiles");
			String[] profiles = env.getActiveProfiles();
			Arrays.sort(profiles);
			for (String profileName : profiles) {
				System.out.println(profileName);
			}

		};
	}
	
}
