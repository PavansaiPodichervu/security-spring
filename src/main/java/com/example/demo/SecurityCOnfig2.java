package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityCOnfig2 {
	// inmermory userdetails configuration example
	@Bean
	public SecurityFilterChain getFilterChain(HttpSecurity http) throws Exception {
		return http
//				.csrf(cutomizer -> Customizer.withDefaults())
				.csrf(csrf -> csrf.disable()).authorizeHttpRequests(request -> request.anyRequest().authenticated())
				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).build();
	}

	@Bean
	public UserDetailsService getUserDetailsService() {
		UserDetails user1 = User.withDefaultPasswordEncoder().username("rick").password("143").roles("ADMIN").build();
		UserDetails user2 = User.withDefaultPasswordEncoder().username("subhu").password("121").roles("USER").build();
		return new InMemoryUserDetailsManager(user1, user2);
	}
}
