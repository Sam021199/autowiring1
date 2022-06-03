package com.demo.component.autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AutowiringApplication.class, args);
	
		Associate a = context.getBean(Associate.class);
		a.show();

	}

}
