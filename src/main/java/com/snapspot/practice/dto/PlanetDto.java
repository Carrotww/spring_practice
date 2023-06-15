package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class PlanetDto {
    private Long id;
    private String color;
    private String shape;
    private Set<Long> memberIds;
    private Set<Long> crewIds;

    // getters and setters
}