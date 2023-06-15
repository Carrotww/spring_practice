package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class CrewDto {
    private Long id;
    private String crewName;
    private Set<Long> memberIds;
    private Set<Long> planetIds;

    // getters and setters
}