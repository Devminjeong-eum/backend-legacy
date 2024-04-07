package com.example.devminjeongeum.domain.user.dto;

import lombok.Getter;

@Getter
public class OauthUserInfoDto {
    private Long id;
    private String nickname;
    private String email;

    public OauthUserInfoDto(Long kakaoId, String nickname, String email) {
        this.id = kakaoId;
        this.nickname = nickname;
        this.email = email;
    }
}
