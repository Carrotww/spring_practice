package com.snapspot.practice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "message")
public class Message extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id", nullable=false)
    private Member member;

    @ManyToOne
    @JoinColumn(name="chatroom_id", nullable=false)
    private Chatroom chatroom;

    @Column(nullable = false)
    private String content;

    // getters and setters
}
