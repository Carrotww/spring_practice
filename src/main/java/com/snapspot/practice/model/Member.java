package com.snapspot.practice.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "member")
public class Member extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String membername;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String memberprofile;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Post> posts;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Message> messages;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    @Column(nullable = true)
    private Set<Comment> comments;

    @ManyToMany(mappedBy = "members")
    private Set<Chatroom> chatrooms;

    @ManyToMany
    @JoinTable(
        name = "Member_Crew", 
        joinColumns = @JoinColumn(name = "member_id"), 
        inverseJoinColumns = @JoinColumn(name = "crew_id")
    )
    private Set<Crew> crews;

    @ManyToMany(mappedBy = "members")
    private Set<Planet> planets;

    // getters and setters
}
