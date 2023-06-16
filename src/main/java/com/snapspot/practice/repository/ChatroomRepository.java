package com.snapspot.practice.repository;

import com.snapspot.practice.model.Chatroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatroomRepository extends JpaRepository<Chatroom, Long>{
    
}
