package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class CrewRequestDto {

    private String crewName;
    private Set<Long> memberIds;

    // Getter and Setters...
}