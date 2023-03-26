package com.emiralpulger.springcoredemo.config;

import com.emiralpulger.springcoredemo.common.Coach;
import com.emiralpulger.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("hamsi")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
