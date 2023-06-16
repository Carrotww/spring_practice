package com.snapspot.practice.controller;

import com.snapspot.practice.dto.CrewDto;
import com.snapspot.practice.model.Crew;
import com.snapspot.practice.model.Member;
import com.snapspot.practice.model.Chatroom;
import com.snapspot.practice.repository.ChatroomRepository;
import com.snapspot.practice.repository.CrewRepository;
import com.snapspot.practice.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

@RestController
@RequestMapping("/api/crew")
public class CrewController {

    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ChatroomRepository chatroomRepository;

    // 멤버를 선택하여 크루를 생성하고 해당 크루의 채팅방을 생성하는 API
    @PostMapping("/create")
    public ResponseEntity<Crew> createCrew(@RequestBody CrewDto request) {
        Crew crew = new Crew();
        crew.setCrewName(request.getCrewName());

        List<Member> memberList = memberRepository.findAllById(request.getMemberIds());
        Set<Member> members = new HashSet<>(memberList);
        crew.setMembers(members);
        Crew savedCrew = crewRepository.save(crew);

        Chatroom chatroom = new Chatroom();
        chatroom.setChatroomName(request.getCrewName() + "의 채팅방");
        chatroom.setCrew(savedCrew);
        chatroom.setMembers(members);

        Chatroom savedChatroom = chatroomRepository.save(chatroom);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
