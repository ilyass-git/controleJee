package com.example.gestiondons.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestion de Campagnes de Dons")
                        .description("API pour gérer les campagnes de dons et les transactions")
                        .version("1.0"));
    }
} 