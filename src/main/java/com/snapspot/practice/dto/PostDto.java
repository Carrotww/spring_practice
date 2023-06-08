package com.snapspot.practice.dto;
import java.util.Set;
import org.locationtech.jts.geom.Point;

public class PostDto {
    private Long id;
    private Long memberId;
    private Set<String> s3;
    private Point position;
    private Boolean openScope;
    private Integer likeCount;
    private Boolean remind;
    private String content;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Set<String> getS3() {
        return s3;
    }
    public void setS3(Set<String> s3) {
        this.s3 = s3;
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }

    public Boolean getOpenScope() {
        return openScope;
    }
    public void setOpenScope(Boolean openScope) {
        this.openScope = openScope;
    }

    public Integer getLikeCount() {
        return likeCount;
    }
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Boolean getRemind() {
        return remind;
    }
    public void setRemind(Boolean remind) {
        this.remind = remind;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}