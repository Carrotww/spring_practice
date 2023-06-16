package com.snapspot.practice.controller;

import com.snapspot.practice.service.MemberLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.geo.Point;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    private MemberLocationService memberLocationService;

    @PostMapping("/{memberId}/location")
    public ResponseEntity<Void> updateMemberLocation(@PathVariable Long memberId, @RequestBody Point location) {
        memberLocationService.saveMemberLocation(memberId, location);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
