package com.xworkz.internet.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.xworkz.internet")
@Configuration
public class CoreConfig {

    public CoreConfig(){
        System.out.println("Configuration is invoked");
    }

}
