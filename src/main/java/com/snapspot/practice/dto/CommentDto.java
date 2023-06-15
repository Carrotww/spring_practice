package com.snapspot.practice.dto;
import lombok.Data;

@Data
public class CommentDto {
    private Long id;
    private Long memberId;
    private Long postId;
    private String content;

    // getters and setters
}
