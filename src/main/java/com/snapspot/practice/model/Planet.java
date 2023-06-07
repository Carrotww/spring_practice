package com.snapspot.practice.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planet")
public class Planet extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String color;
    
    @Column(nullable = false)
    private String shape;

    @ManyToMany
    @JoinTable(
        name = "planet_member",
        joinColumns = @JoinColumn(name = "planet_id"),
        inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private Set<Member> members;

    @ManyToMany
    @JoinTable(
        name = "planet_crew",
        joinColumns = @JoinColumn(name = "planet_id"),
        inverseJoinColumns = @JoinColumn(name = "crew_id")
    )
    private Set<Crew> crews;

    // getters and setters
}