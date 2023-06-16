package com.snapspot.practice.controller;

import com.snapspot.practice.model.Crew;
import com.snapspot.practice.model.Member;
import com.snapspot.practice.repository.CrewRepository;
import com.snapspot.practice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Set;

@RestController
@RequestMapping("/api/crews")
public class CrewController {

    @Autowired
    private CrewRepository crewRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/create")
    public ResponseEntity<Crew> createCrew(@RequestBody CreateCrewRequest request) {
        Crew crew = new Crew();
        crew.setCrewName(request.getCrewName());

        Set<Member> members = memberRepository.findAllById(request.getMemberIds());
        crew.setMembers(members);

        Crew savedCrew = crewRepository.save(crew);

        return new ResponseEntity<>(savedCrew, HttpStatus.CREATED);
    }

    // Nested class for handling create crew request
    public static class CreateCrewRequest {
        private String crewName;
        private Set<Long> memberIds;

        // getters and setters
    }
}
