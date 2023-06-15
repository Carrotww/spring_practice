package com.snapspot.practice.dto;
import java.util.Set;
import org.locationtech.jts.geom.Point;
// lombok의 Data 어노테이션을 사용하면 getter, setter, toString, equals, hashCode 등을 자동으로 생성해준다
import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private Long memberId;
    private Set<String> s3;
    private Point position;
    private Boolean openScope;
    private Integer likeCount;
    private Boolean remind;
    private String content;

}