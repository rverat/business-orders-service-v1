package com.thedevlair.business.orders.service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Business Orders API", version = "1.0.0"))
public class BusinessOrdersServiceV1Application {

    public static void main(String[] args) {
        SpringApplication.run(BusinessOrdersServiceV1Application.class, args);
    }

}
