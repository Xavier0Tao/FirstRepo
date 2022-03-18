package com.sprxavier.springdemo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket configSwagger() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        ApiInfo info = new ApiInfoBuilder()
                .title("First service charged by SpringBoot Administration")
                .description("This is how front end and back end interact using apis")
                .contact(new Contact("Xavier", "http://localhost:8084", "1059044790@qq.com"))
                .version("1.5")
                .build();


        docket.apiInfo(info);

        return docket;
    }
}
