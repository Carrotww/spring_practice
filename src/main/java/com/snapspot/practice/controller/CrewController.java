package com.snapspot.practice.controller;

import com.snapspot.practice.dto.CrewRequestDto;
import com.snapspot.practice.dto.CrewResponseDto;
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

    @PostMapping("/create")
    public ResponseEntity<CrewResponseDto> createCrew(@RequestBody CrewRequestDto request) {
        CrewResponseDto savedCrew = crewService.createCrew(request);
        return new ResponseEntity<>(savedCrew, HttpStatus.CREATED);
    }
}
