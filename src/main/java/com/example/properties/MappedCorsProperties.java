package com.example.properties;

import com.example.properties.allowed.CorsAllowedProperties;
import com.example.properties.exposed.CorsExposedProperties;

public record MappedCorsProperties(
        String path,
        CorsAllowedProperties allowed,
        CorsExposedProperties exposed,
        Long maxAge
) {
    public MappedCorsProperties {
        if (maxAge == null) {
            maxAge = 3600L;
        }
    }
}
