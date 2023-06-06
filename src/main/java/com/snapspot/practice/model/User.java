package com.snapspot.practice.model;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "users")
public class User extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userProfile;

    @ManyToMany
    @JoinTable(
        name = "user_chatroom",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "chatroom_id"))
    private Set<Chatroom> chatrooms;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "User_Group", 
        joinColumns = { @JoinColumn(name = "user_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "group_id") }
    )
    private Set<Group> groups = new HashSet<>();

    // getters and setters
}
