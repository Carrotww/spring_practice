package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class ChatroomDto {
    private Long id;
    private String chatroomName;
    private Set<Long> memberIds;
    private Long crewId;
    
    // getters and setters
}
