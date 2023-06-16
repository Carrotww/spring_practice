package com.snapspot.practice.repository;

import com.snapspot.practice.model.Crew;
import org.springframework.data.jpa.repository.JpaRepository;
// @Repository 어노테이션을 사용하지 않아도 JpaRepository를 상속받는 인터페이스는 자동으로 빈에 등록됨
// 하지만 명시성과 예외 반화를 위해 @Repository 어노테이션을 붙여야 함
import org.springframework.stereotype.Repository;

@Repository
public interface CrewRepository extends JpaRepository<Crew, Long> {
    // 여기에 추가적인 쿼리 메소드를 정의할 수 있습니다.
}
