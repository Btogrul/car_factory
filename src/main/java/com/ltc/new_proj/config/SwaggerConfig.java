package com.ltc.new_proj.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Car and Factory"
                ),
                description = "OpenApi documentation for Frontend",
                title = "Car and Factory",
                version = "1.0",
                termsOfService = "Terms of service"
        )

)
public class SwaggerConfig {

}
