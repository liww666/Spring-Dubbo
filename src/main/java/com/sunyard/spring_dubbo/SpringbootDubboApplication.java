package com.sunyard.spring_dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource(locations="classpath:provider.xml")
public class SpringbootDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboApplication.class, args);
	}

}

