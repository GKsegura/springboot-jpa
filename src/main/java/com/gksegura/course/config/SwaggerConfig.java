package com.gksegura.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Course API")
                        .version("1.0.0")
                        .description("Documentação dos endpoints do projeto Course")
                        .contact(new Contact()
                                .name("GKsegura")
                                .email("jose.segura.ms@gmail.com")
                                .url("https://github.com/gksegura")));
    }
}