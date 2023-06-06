package com.snapspot.practice.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 아래 어노테이션 차이 찾아보기 비슷한것 같으면서 다름
@EnableJpaAuditing
@MappedSuperclass
public abstract class BaseModel {
    // // prepersist 찾아보기
    // @PrePersist
    // protected void onCreate() {
    //     createdAt = LocalDateTime.now();
    // }

    // @PreUpdate
    // protected void onUpdate() {
    //     updatedAt = LocalDateTime.now();
    // }

    // created_at 필드와 updated_at 필드를 자동으로 채워주는 기능
    // 이 기능을 사용하기 위해서는 @EntityListeners(AuditingEntityListener::class) 어노테이션을 추가해야 함
    // @CreatedDate, @LastModifiedDate 어노테이션을 필드에 추가해야 함
    // @EnableJpaAuditing 어노테이션을 메인 클래스에 추가해야 함
    @CreatedDate
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @CreationTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedDate;

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }
}