package com.portal.adminpanel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AdminpanelApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(AdminpanelApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(AdminpanelApplication.class);
	}

}
