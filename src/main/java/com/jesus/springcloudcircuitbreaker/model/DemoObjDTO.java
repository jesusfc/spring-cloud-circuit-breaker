package com.jesus.springcloudcircuitbreaker.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Author Jesús Fdez. Caraballo
 * jesus.fdez.caraballo@gmail.com
 * Created on abr - 2024
 */
@Data
@Builder
public class DemoObjDTO {
    private UUID id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
}
