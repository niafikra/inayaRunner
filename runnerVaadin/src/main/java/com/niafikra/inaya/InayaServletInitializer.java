package com.niafikra.inaya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication(scanBasePackages = "com.niafikra.inaya")
public class InayaServletInitializer extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(InayaServletInitializer.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(InayaServletInitializer.class);
    }

}
