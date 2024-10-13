package com.socat.socatserver.config

import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun openApi(): OpenAPI {

        return OpenAPI()
            .info(
                Info()
                    .version("v0.1")
                    .title("Socat")
                    .description("Socat API 문서")
            )
    }
}