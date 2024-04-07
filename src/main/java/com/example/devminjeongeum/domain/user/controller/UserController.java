package com.example.devminjeongeum.domain.user.controller;

import com.example.devminjeongeum.domain.user.dto.OauthLoginRequestDto;
import com.example.devminjeongeum.domain.user.service.KakaoUserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

//    @Value("${kakao.api_key}")
//    private String kakaoApiKey;
//
//    @Value("${kakao.redirect_uri}")
//    private String kakaoRedirectUri;
//
//    private final KakaoUserService kakaoUserService;
//
//    @PostMapping("/user/kakao/login")
//    public ResponseEntity<String> kakaoLogin(@RequestBody OauthLoginRequestDto oauthLoginRequestDto,
//                                             HttpServletResponse httpServletResponse){
//        String location = "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="+kakaoApiKey+"&redirect_uri="+kakaoRedirectUri;
//        kakaoUserService.kakaoLogin(oauthLoginRequestDto.getCode(), httpServletResponse);
//        return ResponseEntity.ok().body("ok");
//    }
}
