package com.snapspot.practice.model;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;
import java.util.Set;

@Entity
@Table(name = "posts")
public class Post extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "user_post",
        joinColumns = @JoinColumn(name = "post_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;

    @Column(nullable = false)
    private String s3;

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point position;

    @Column(nullable = false)
    private Boolean openScope;

    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer like;

    @Column(nullable = false)
    private Boolean remind;

    @Column(nullable = false)
    private String content;

    // getters and setters
}
