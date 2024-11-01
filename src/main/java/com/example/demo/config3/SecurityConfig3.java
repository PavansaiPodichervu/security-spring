package com.example.demo.config3;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig3 {
//	@Autowired
//	UserDetailsService detailsService;
//
//	@Bean
//	public SecurityFilterChain getFilterChain(HttpSecurity http) throws Exception {
//		return http.csrf(cutomizer -> Customizer.withDefaults())
//				.authorizeHttpRequests(request -> request.anyRequest().authenticated())
//				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults()).build();
//	}
//
//	@Bean
//	public AuthenticationProvider getAuthenticationProvider() {
//		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//		authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		authenticationProvider.setUserDetailsService(detailsService);
//		return authenticationProvider;
//	}
}
