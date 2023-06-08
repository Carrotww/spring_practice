package com.snapspot.practice.dto;

import java.util.Set;
import java.util.HashSet;

public class MemberDto {
    // write MemberDto
    private Long id;
    private String membername;
    private String nickname;
    private String password;
    private String memberprofile;
    private Set<Long> postIds;
    private Set<Long> messageIds;
    private Set<Long> commentIds;
    private Set<Long> chatroomIds;
    private Set<Long> crewIds;
    private Set<Long> planetIds;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getMembername() {
        return membername;
    }
    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberprofile() {
        return memberprofile;
    }
    public void setMemberprofile(String memberprofile) {
        this.memberprofile = memberprofile;
    }

    public Set<Long> getPostIds() {
        return postIds;
    }
    public void setPostIds(Set<Long> postIds) {
        this.postIds = postIds;
    }

    public Set<Long> getMessageIds() {
        return messageIds;
    }
    public void setMessageIds(Set<Long> messageIds) {
        this.messageIds = messageIds;
    }

    public Set<Long> getCommentIds() {
        return commentIds;
    }
    public void setCommentIds(Set<Long> commentIds) {
        this.commentIds = commentIds;
    }

    public Set<Long> getChatroomIds() {
        return chatroomIds;
    }
    public void setChatroomIds(Set<Long> chatroomIds) {
        this.chatroomIds = chatroomIds;
    }

    public Set<Long> getCrewIds() {
        return crewIds;
    }
    public void setCrewIds(Set<Long> crewIds) {
        this.crewIds = crewIds;
    }

    public Set<Long> getPlanetIds() {
        return planetIds;
    }
    public void setPlanetIds(Set<Long> planetIds) {
        this.planetIds = planetIds;
    }
}