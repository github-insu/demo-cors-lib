package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.cors")
public record CorsProperties(
        int maxAge
) {
    public CorsProperties {
        System.out.println("------------------------");
        System.out.println("maxAge = "+maxAge);
    }
}
