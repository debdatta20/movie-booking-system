package com.example.Movie.Configuration;


import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CrosConfig {
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration config=new CorsConfiguration();
        
        config.setAllowedOrigins(List.of("http://localhost:8080"));
        
        config.setAllowedMethods(List.of("GET",
            "POST",
            "PUT",
            "DELETE",
            "OPTIONS"
        ));

        //Allow cookies /JWT
        config.setAllowCredentials(true);
        
        //Apply CORS to all endpoints
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    
}
