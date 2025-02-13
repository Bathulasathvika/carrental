package com.sathvika.carrental;

import com.sathvika.carrental.service.CarService;
import com.sathvika.carrental.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CarService carService() {
        return new CarService();
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }
}