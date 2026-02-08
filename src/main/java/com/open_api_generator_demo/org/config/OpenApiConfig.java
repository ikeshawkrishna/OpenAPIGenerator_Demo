package com.open_api_generator_demo.org.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Order & Product API")
                .description("E-commerce Order and Product management API")
                .version("1.0.0"))
            .addServersItem(new Server()
                .url("http://localhost:8080")
                .description("Local server"));
    }
}
