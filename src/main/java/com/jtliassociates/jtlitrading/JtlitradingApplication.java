package com.jtliassociates.jtlitrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class JtlitradingApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JtlitradingApplication.class);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(JtlitradingApplication.class, args);
	}

}
