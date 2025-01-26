package com.example.backend.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

// @OpenAPIDefinition(info = @Info(title = "TEST", description = "Swagger 확인용 문서", version = "v1.0"))
@Configuration
public class SwaggerConfig {
    // @Bean
    // public OpenAPI openAPI() {
    // return new OpenAPI().components(new Components()).info(apiInfo());
    // }

    // private Info apiInfo() {
    // return new Info().title("title").description("de").version("1.0.0");
    // }

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Spring Boot 를 이용한 API 확인 Swagger")
                .version("0.1")
                .description("API 문서입니다. \n Demo 버전으로 들고다니는 용도입니다.");
        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
