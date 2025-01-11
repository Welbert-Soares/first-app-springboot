package com.w3soft.firstappspringboot;

import com.w3soft.firstappspringboot.controller.ControllerFirst;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = ControllerFirst.class)
public class FirstAppSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstAppSpringbootApplication.class, args);
    }

}
