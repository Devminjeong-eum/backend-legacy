package com.example.devminjeongeum.domain.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KakaoUserService {

    @Value("${kakao.api_key}")
    private String restApiKey;

    @Value("${kakao.redirect_uri}")
    private String redirectUri;

}
