package com.snapspot.practice.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "groups")
public class Group extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="chatroom_id", nullable=false)
    private Chatroom chatroom;

    @ManyToMany(mappedBy = "groups")
    private Set<User> users;

    // getters and setters
}
