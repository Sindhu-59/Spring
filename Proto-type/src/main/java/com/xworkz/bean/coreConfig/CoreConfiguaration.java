package com.xworkz.bean.coreConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bean")
public class CoreConfiguaration {

    public  CoreConfiguaration(){
        System.out.println("Core Config");
    }
}
