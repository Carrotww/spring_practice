package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class CrewResponseDto {

    private Long id;
    private String crewName;
    private Set<String> members;

    // Getter and Setters...
}