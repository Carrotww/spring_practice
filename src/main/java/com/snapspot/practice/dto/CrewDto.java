package com.snapspot.practice.dto;

import java.util.Set;
import lombok.Data;

@Data
public class CrewDto {
    private Long id;
    private String crewName;
    private Set<Long> memberIds;
    private Set<Long> planetIds;

    // getters and setters
    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getCrewName() {
    //     return crewName;
    // }
    // public void setCrewName(String crewName) {
    //     this.crewName = crewName;
    // }

    // public Set<Long> getMemberIds() {
    //     return memberIds;
    // }
    // public void setMemberIds(Set<Long> memberIds) {
    //     this.memberIds = memberIds;
    // }

    // public Set<Long> getPlanetIds() {
    //     return planetIds;
    // }
    // public void setPlanetIds(Set<Long> planetIds) {
    //     this.planetIds = planetIds;
    // }
}