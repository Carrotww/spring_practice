package com.snapspot.practice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.snapspot.practice.model.Member;
public interface MemberRepository extends JpaRepository<Member, Long>{
    
}
