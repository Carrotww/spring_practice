package com.snapspot.practice.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chatrooms")
public class Chatroom extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "chatroom")
    private Set<Message> messages;

    @OneToOne(mappedBy = "chatroom")
    private Group group;

    // getters and setters
}
