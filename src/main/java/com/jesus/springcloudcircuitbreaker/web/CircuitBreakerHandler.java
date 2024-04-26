package com.jesus.springcloudcircuitbreaker.web;

import com.jesus.springcloudcircuitbreaker.model.DemoObjDTO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * Author Jesús Fdez. Caraballo
 * jesus.fdez.caraballo@gmail.com
 * Created on abr - 2024
 */
@Component
public class CircuitBreakerHandler {

    public Mono<ServerResponse> getDemoResponse(ServerRequest serverRequest) {

        System.out.println("CircuitBreakerHandler.getDemoResponse");

        DemoObjDTO demoObjDTO = DemoObjDTO.builder()
                .id(UUID.randomUUID())
                .name("Circuit Breaker")
                .description("Circuit Breaker description")
                .createdAt(LocalDateTime.now())
                .build();

        return ok()
                .contentType(MediaType.APPLICATION_NDJSON)
                .body(Mono.just(demoObjDTO), DemoObjDTO.class);

    }
}
