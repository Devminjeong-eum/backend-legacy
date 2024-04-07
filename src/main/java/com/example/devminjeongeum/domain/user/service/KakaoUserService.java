package com.example.devminjeongeum.domain.user.service;

import com.example.devminjeongeum.domain.user.dto.OauthUserInfoDto;
import com.example.devminjeongeum.domain.user.entity.User;
import com.example.devminjeongeum.domain.user.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class KakaoUserService {

//    private final RestTemplate restTemplate;
//
//    private final UserRepository userRepository;
//
//    @Value("${kakao.api_key}")
//    private String restApiKey;
//
//    @Value("${kakao.redirect_uri}")
//    private String redirectUri;
//
//    public void kakaoLogin(String code, HttpServletResponse httpServletResponse)
//            throws JsonProcessingException, UnsupportedEncodingException {
//        String kakaoAccessToken = getKakaoAccessToken(code);
//        OauthUserInfoDto kakaoUserInfoDto = getKakaoUserInfo(kakaoAccessToken);
//        registerKakaoUserIfNeeded(kakaoUserInfoDto, httpServletResponse);
//    }
//
//    private String getKakaoAccessToken(String code) throws JsonProcessingException {
//        URI uri = UriComponentsBuilder
//                .fromUriString("https://kauth.kakao.com")
//                .path("/oauth/token")
//                .encode()
//                .build()
//                .toUri();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
//        body.add("grant_type", "authorization_code");
//        body.add("client_id", restApiKey);
//        body.add("redirect_uri", redirectUri);
//        body.add("code", code);
//
//        RequestEntity<MultiValueMap<String, String>> requestEntity = RequestEntity.post(uri).headers(headers).body(body);
//        ResponseEntity<String> responseEntity = restTemplate.exchange(requestEntity, String.class);
//
//        JsonNode jsonNode = new ObjectMapper().readTree(responseEntity.getBody());
//        String kakaoAccessToken = jsonNode.get("access_token").asText();
//        return kakaoAccessToken;
//    }
//
//    private OauthUserInfoDto getKakaoUserInfo(String kakaoAccessToken) throws JsonProcessingException {
//        URI uri = UriComponentsBuilder
//                .fromUriString("https://kapi.kakao.com")
//                .path("/v2/user/me")
//                .encode()
//                .build()
//                .toUri();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Bearer " + kakaoAccessToken);
//        headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
//
//        RequestEntity<MultiValueMap<String, String>> requestEntity = RequestEntity.post(uri).headers(headers).body(new LinkedMultiValueMap<>());
//        ResponseEntity<String> response = restTemplate.exchange(requestEntity, String.class);
//
//        JsonNode jsonNode = new ObjectMapper().readTree(response.getBody());
//        Long kakaoId = jsonNode.get("id").asLong();
//        String nickname = jsonNode.get("properties").get("nickname").asText();
//        String email = jsonNode.get("kakao_account").get("email").asText();
//        OauthUserInfoDto kakaoUserInfoDto = new OauthUserInfoDto(kakaoId, nickname, email);
//        return kakaoUserInfoDto;
//    }
//
//    public void registerKakaoUserIfNeeded(OauthUserInfoDto kakaoUserInfoDto,
//                                          HttpServletResponse httpServletResponse) throws UnsupportedEncodingException {
//        Long kakaoId = kakaoUserInfoDto.getId();
//        User kakaoUser = userRepository.findById(kakaoId).orElse(null);
//
//        if (kakaoUser == null) {
//            String kakaoEmail = kakaoUserInfoDto.getEmail();
//            User sameEmailUser = userRepository.findByEmail(kakaoEmail).orElse(null);
//            if (sameEmailUser != null) {
//                kakaoUser = sameEmailUser;
//                kakaoUser = kakaoUser.updateKakaoId(kakaoId);
//            } else {
//                String password = UUID.randomUUID().toString();
//                String encodedPassword = passwordEncoder.encode(password);
//                kakaoUser = User.builder()
//                        .email(kakaoUserInfoDto.getEmail())
//                        .password(encodedPassword)
//                        .nickname(kakaoUserInfoDto.getNickname())
//                        .isEmailNotificationAgreed(false)
//                        .kakaoId(kakaoId)
//                        .build();
//            }
//        }
//
//        // 이메일 기반 JWT 토큰 정보 생성
//        String email = kakaoUser.getEmail();
//        JwtTokenInfo.AccessTokenInfo accessTokenInfo = jwtTokenUtil.createAccessTokenInfo(email);
//        JwtTokenInfo.RefreshTokenInfo refreshTokenInfo = jwtTokenUtil.createRefreshTokenInfo(email);
//
//        // 액세스 토큰을 쿠키에 추가해 반환
//        Cookie jwtCookie = jwtTokenUtil.addTokenToCookie(accessTokenInfo.getAccessToken());
//        httpServletResponse.addCookie(jwtCookie);
//
//        // JWT 토큰 정보 업데이트 후 유저 등록
//        userService.updateAccessToken(kakaoUser, accessTokenInfo);
//        userService.updateRefreshToken(kakaoUser, refreshTokenInfo);
//    }
}
