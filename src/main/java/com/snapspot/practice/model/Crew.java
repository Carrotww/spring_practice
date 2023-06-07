package com.snapspot.practice.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "crew")
public class Crew extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String crew_name;

    @ManyToMany(mappedBy = "crews")
    private Set<Member> members;

    @ManyToMany(mappedBy = "crews")
    private Set<Planet> planets;

    // getters and setters
}