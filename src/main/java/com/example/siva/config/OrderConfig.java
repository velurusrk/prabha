package com.example.siva.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;

@EnableSwagger2
@Configuration
public class OrderConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.siva"))
                .build().apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Ordering REST API",
                "Rest API with ordering services.",
                "API TOS",
                "Terms of service",
                new Contact("Sivaramakrishna", "siva", "vsivaram444"),
                "License of API", "API license URL", Collections.emptyList());
    }
}