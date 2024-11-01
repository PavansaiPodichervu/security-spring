package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityConfig {
//default configuration
//	@Bean
//	public SecurityFilterChain getFilterChain(HttpSecurity http) throws Exception {
//		http.csrf(cutomizer -> Customizer.withDefaults());
//		http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//		http.formLogin(Customizer.withDefaults());
//		http.httpBasic(Customizer.withDefaults());
//		return http.build();
//	}

//	(or)
	
	
	
	
//	@Bean
//	public SecurityFilterChain getFilterChain(HttpSecurity http) throws Exception {
//		return http.csrf(cutomizer -> Customizer.withDefaults())
//				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
//				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).build();
//	}
}
