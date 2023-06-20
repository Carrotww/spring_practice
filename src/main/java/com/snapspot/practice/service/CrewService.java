package com.snapspot.practice.service;

import com.snapspot.practice.dto.CrewRequestDto;
import com.snapspot.practice.dto.CrewResponseDto;
import com.snapspot.practice.model.Crew;
import com.snapspot.practice.model.Member;
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

    public CrewResponseDto createCrew(CrewRequestDto request) {
        Crew crew = new Crew();
        crew.setCrewName(request.getCrewName());

        List<Member> memberList = memberRepository.findAllById(request.getMemberIds());
        Set<Member> members = new HashSet<>(memberList);
        crew.setMembers(members);
        
        Crew savedCrew = crewRepository.save(crew);
        
        return convertToDto(savedCrew);
    }

    private CrewResponseDto convertToDto(Crew crew) {
        CrewResponseDto dto = new CrewResponseDto();
        dto.setId(crew.getId());
        dto.setCrewName(crew.getCrewName());
        // Convert members to a set of names or IDs or whatever you prefer
        // Set the members field in dto
        return dto;
    }
}
