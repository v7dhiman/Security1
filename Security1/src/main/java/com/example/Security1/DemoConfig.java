package com.example.Security1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DemoConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Karan")
                .password("karan123")  //shgvsiau789832kkf
                .authorities("qa")
                .and()
                .withUser("Rashmi")
                .password("rashmi123")
                .authorities("dev");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/testcode/**").hasAuthority("qa")
                .antMatchers("/developcode/**").hasAuthority("dev")
                .antMatchers("/accessserver/**").hasAnyAuthority("dev", "qa")
                .antMatchers("/home").permitAll()
                .and()
                .formLogin();
    }
    @Bean
    PasswordEncoder getPE()
    {
        return NoOpPasswordEncoder.getInstance();
    }
    // 2 Apples 1 apple is stale and 1 is fresh
    // 1 whole Apple and 1 apple juice

    //1 rp, 1ep
    // 2 rp
    // 2 ep
}
