package com.snapspot.practice.model;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "planets")
public class Planet extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "white")
    private String color;

    @Column(nullable = false, columnDefinition = "circle")
    private String shape;

    @ManyToMany
    @JoinTable(
        name = "planet_user",
        joinColumns = @JoinColumn(name = "planet_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;

    @ManyToMany
    @JoinTable(
        name = "planet_group",
        joinColumns = @JoinColumn(name = "planet_id"),
        inverseJoinColumns = @JoinColumn(name = "group_id"))
    private Set<Group> groups;

    // getters and setters
}
