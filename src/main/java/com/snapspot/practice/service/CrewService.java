package com.snapspot.practice.service;

import com.snapspot.practice.dto.CrewDto;
import com.snapspot.practice.model.Crew;
import com.snapspot.practice.model.Member;
import com.snapspot.practice.model.Chatroom;
import com.snapspot.practice.repository.ChatroomRepository;
import com.snapspot.practice.repository.CrewRepository;
import com.snapspot.practice.repository.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CrewService {

    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ChatroomRepository chatroomRepository;

    public Crew createCrew(CrewDto request) {
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

        chatroomRepository.save(chatroom);

        return savedCrew;
    }
}