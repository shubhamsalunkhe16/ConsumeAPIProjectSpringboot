package com.example.fetch.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfigure {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
