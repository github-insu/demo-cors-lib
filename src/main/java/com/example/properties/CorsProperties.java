package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("app.cors")
public record CorsProperties(
        @NestedConfigurationProperty
        MappedCorsProperties[] endpoints
) {
    public CorsProperties {
        for (var endpoint : endpoints) {
            System.out.println(endpoint);
        }
    }
}
