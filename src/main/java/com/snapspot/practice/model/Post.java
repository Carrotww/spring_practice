package com.snapspot.practice.model;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "post")
public class Post extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private Set<Comment> comments = new HashSet<>();

    @Column(nullable = false)
    private Set<String> s3 = new HashSet<>();

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point position;

    @Column(nullable = false)
    private Boolean openScope;

    @Column(nullable = false, columnDefinition = "int default 0")
    private Integer like_count;

    @Column(nullable = false)
    private Boolean remind;

    @Column(nullable = false)
    private String content;

    // getters and setters
}
