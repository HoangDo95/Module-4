package com.codegym.case_study.config;

import com.codegym.case_study.service.MyUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyUserDetailServiceImpl myUserDetailService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailService).passwordEncoder(passwordEncoder());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests().antMatchers("/","/login").permitAll();

        http.authorizeRequests().and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/home");

        http.authorizeRequests()
                .antMatchers("/employee").hasAnyRole("USER")
                .antMatchers("/employee/**","/customer/**","/facility/**","/contract/**").hasAnyRole("ADMIN")
                .anyRequest().authenticated();

        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");
    }
}
