package com.snapspot.practice.dto;

import lombok.Data;
import java.util.Set;

@Data
public class CreateCrewRequest {
    private String crew_name;
    private Set<Long> member_id;
}