package com.swagger.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringSwaggerApplication {

    /*Swagger is a specification and complete framework implementation for
    describing, producing, consuming, and visualizing RESTful web services.
    The goal of Swagger is to enable client and documentation systems
    to update at the same pace as the server*/

    public static void main(String[] args) {
        SpringApplication.run(SpringSwaggerApplication.class, args);
    }

    //Controls what we APIs to expose in swagger
    @Bean
    public Docket getSwaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                //.paths(PathSelectors.ant("/car/*"))
                .apis(RequestHandlerSelectors.basePackage("com.swagger.example"))
                .build()
                .apiInfo(getApiInfo());
    }

    //title, description, version, termsOfServiceUrl, contact, license, licenseUrl, vendorExtensions
    private ApiInfo getApiInfo() {
        return new ApiInfo("Car Info API", "API to demo swagger", "1.0", null, null, null, null, Collections.EMPTY_LIST);
    }

}
