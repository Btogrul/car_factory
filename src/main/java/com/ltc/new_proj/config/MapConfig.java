package com.ltc.new_proj.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
