package com.snapspot.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.data.geo.Point;

@Service
public class MemberLocationService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void saveMemberLocation(Long memberId, Point location) {
        String hashKey = "member_location_" + memberId;
        // Convert the Point to a string representation "x, y"
        String locationString = location.getX() + "," + location.getY();
        redisTemplate.opsForHash().put("Member", hashKey, locationString);
    }

    public Point getMemberLocation(Long memberId) {
        String hashKey = "member_location_" + memberId;
        // Retrieve the location string
        String locationString = (String) redisTemplate.opsForHash().get("Member", hashKey);
        // Convert the location string back to a Point
        String[] coordinates = locationString.split(",");
        double x = Double.parseDouble(coordinates[0]);
        double y = Double.parseDouble(coordinates[1]);
        return new Point(x, y);
    }
}
