//package com.in28minutes.rest.webservices.restfulwebservices.basic;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class BasicAuthenticationSecurityConfiguration {
//	
//	//Filter chain
//	//by default authenticate all requests
//	//disabling csrf
//	//we are creating here a stateless rest api
////	@Bean
////	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////	    http.authorizeHttpRequests(
////	            auth -> auth.anyRequest().authenticated()
////	    );
////	    http.formLogin(Customizer.withDefaults());
////	    http.csrf(csrf -> csrf.disable());
////	    http.headers(header -> header.frameOptions(frameOptions -> frameOptions.disable()));
////	 
////	    return http.build();
////	}
////	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
////		http.authorizeHttpRequests(
////				auth -> auth.anyRequest().authenticated()
////				)
////		.httpBasic(Customizer.withDefaults())
////		
////		.sessionManagement(
////				session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
////		
////		.csrf().disable()
////		.build();
////		return http.build();
////	}
//
//}
