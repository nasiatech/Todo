package com.todo.todoapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    private final String[] ALLOWED_ORIGIN = new String[]{
            "http://localhost:4200"
    };
    private final String[] ALLOWED_METHODS = new String[] {
            "GET", "PUT", "DELETE", "POST"
    };

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        corsRegistry.addMapping("/**" )
                .allowedOrigins(ALLOWED_ORIGIN)
                .allowedMethods(ALLOWED_METHODS)
                ;
    }
}
