package com.example.properties.allowed;

public record CorsAllowedProperties(
        String[] headers,
        String[] methods,
        String[] origins,
        Boolean credentials
) {
    public CorsAllowedProperties {
        if (credentials == null) {
            credentials = true;
        }
    }
}
