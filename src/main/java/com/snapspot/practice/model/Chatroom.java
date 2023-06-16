package com.snapspot.practice.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "chatroom")
public class Chatroom extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String chatroom_name;

    @ManyToMany
    @JoinTable(
        name = "chatroom_member",
        joinColumns = @JoinColumn(name = "chatroom_id"),
        inverseJoinColumns = @JoinColumn(name = "member_id"))
    private Set<Member> members = new HashSet<>();

    @OneToMany(mappedBy = "chatroom", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Message> messages = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "crew_id", referencedColumnName = "id")
    private Crew crew;

    public String setChatroomName(String chatroom_name) {
        return this.chatroom_name = chatroom_name;
    }

    public Set<Member> setMembers(Set<Member> members) {
        return this.members = members;
    }

    public Crew setCrew(Crew crew) {
        return this.crew = crew;
    }

    // getters and setters
}
