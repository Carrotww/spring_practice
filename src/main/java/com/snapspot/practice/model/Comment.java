package com.snapspot.practice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comment")
public class Comment extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id", nullable=false)
    private Member member;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;

    @Column(nullable = false)
    private String content;

    // getters and setters
}
