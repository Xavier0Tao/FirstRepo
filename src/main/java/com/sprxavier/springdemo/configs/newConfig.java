package com.sprxavier.springdemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beanInclude")
public class newConfig {

    @Bean("herName")
    public String name() {
        return "what's her name?蒋杉琪";
    }


}
