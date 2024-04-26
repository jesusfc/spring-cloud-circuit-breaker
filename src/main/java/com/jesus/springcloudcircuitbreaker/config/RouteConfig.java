package com.jesus.springcloudcircuitbreaker.config;

import com.jesus.springcloudcircuitbreaker.web.CircuitBreakerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * Author Jesús Fdez. Caraballo
 * jesus.fdez.caraballo@gmail.com
 * Created on abr - 2024
 */
@Configuration
public class RouteConfig {
    @Bean
    public RouterFunction<ServerResponse> routerFunction(CircuitBreakerHandler  circuitBreakerHandler) {
        return route(GET("/service-fail").and(accept(MediaType.APPLICATION_NDJSON)), circuitBreakerHandler::getDemoResponse);

    }
}
