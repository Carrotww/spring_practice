package com.snapspot.practice.controller;

import com.snapspot.practice.dto.CrewDto;
import com.snapspot.practice.model.Crew;
import com.snapspot.practice.service.CrewService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crew")
public class CrewController {

    @Autowired
    private CrewService crewService;

    // 멤버를 선택하여 크루를 생성하고 해당 크루의 채팅방을 생성하는 API
    @PostMapping("/create")
    public ResponseEntity<Crew> createCrew(@RequestBody CrewDto request) {
        Crew savedCrew = crewService.createCrew(request);
        return new ResponseEntity<>(savedCrew, HttpStatus.CREATED);
    }
}
