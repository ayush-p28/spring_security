package com.security.spring_security.config;

import org.springframework.security.config.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.withUsername("ayush")
        .password(passwordEncoder().encode("ayush"))
        .roles("ADMIN").build();
        UserDetails normal = User.withUsername("prateek")
        .password(passwordEncoder().encode("prateek"))
        .roles("NORMAL").build();

        InMemoryUserDetailsManager users = new InMemoryUserDetailsManager(admin,normal);
        return users;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(AbstractHttpConfigurer::disable)
        .cors(AbstractHttpConfigurer::disable)
        .authorizeHttpRequests(request -> {
          request.requestMatchers("/home/public").permitAll()
          .requestMatchers("/home/admin").hasRole("ADMIN")
          .requestMatchers("/home/normal").hasRole("NORMAL")
          .anyRequest().authenticated();
        }).formLogin(Customizer.withDefaults());

        return http.build();
    }
}


// http.csrf(AbstractHttpConfigurer::disable)
// .authorizeHttpRequests(authz->authz.requestMatchers("/home/public").permitAll())
// .and().formLogin(null);