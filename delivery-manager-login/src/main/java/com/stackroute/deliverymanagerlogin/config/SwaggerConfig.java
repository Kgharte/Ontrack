package com.stackroute.deliverymanagerlogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket productapi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.deliverymanagerlogin.DeliveryManagerController"))
                .paths(regex("/api/v1.*"))
                .build()
                .apiInfo(metaInfo());
    }


    private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST API")
                .description("\"Delivery manager login\"")
                .version("1.0.0")
                .termsOfServiceUrl("Term of service")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(new Contact("Anagha", "https://github.com/Anagha1Ranganath", "CRanagha@gmail.com"))
                .build();
    }
}
