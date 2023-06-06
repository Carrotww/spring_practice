package com.snapspot.practice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;

    @Column(nullable = false)
    private String content;

    // getters and setters
}
