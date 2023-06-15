package com.snapspot.practice.dto;

import lombok.Data;

@Data
public class MessageDto {
    private Long id;
    private Long memberId;
    private Long chatroomId;
    private String content;

    // getters and setters
}
