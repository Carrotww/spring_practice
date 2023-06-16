package com.snapspot.practice.controller;

import com.snapspot.practice.dto.CreateCrewRequest;
import com.snapspot.practice.dto.CrewDto;
import com.snapspot.practice.model.Crew;
import com.snapspot.practice.model.Member;
import com.snapspot.practice.repository.CrewRepository;
import com.snapspot.practice.repository.MemberRepository;

import org.apache.coyote.Response;
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

    @PostMapping("/create")
    public ResponseEntity<Crew> createCrew(@RequestBody CrewDto request) {
        Crew crew = new Crew();
        crew.setCrewName(request.getCrewName());

        List<Member> memberList = memberRepository.findAllById(request.getMemberIds());
        Set<Member> members = new HashSet<>(memberList);
        crew.setMembers(members);
        crewRepository.save(crew);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
