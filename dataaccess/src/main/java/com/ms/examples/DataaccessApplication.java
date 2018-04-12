package com.ms.examples;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;


@SpringBootApplication
public class DataaccessApplication {

	public static void main(String[] args) {

		SpringApplication.run(DataaccessApplication.class, args);
	}


	@Bean
	@Order(value=3)
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			//System.out.println("Order 3");
			System.out.println("Spring Application from database Boot Application");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

		};
	}
}
