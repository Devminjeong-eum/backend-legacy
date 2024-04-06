package com.example.devminjeongeum.domain.word.dto;

import lombok.Getter;

@Getter
public class WordResponseDto {

    private final long wordId;
    private final String wordName;
    private final String wordSpeak;
    private final String wordEx;
    private final String wordDescription;

    public WordResponseDto(long wordId,String wordName,String wordSpeak,String wordEx,String wordDescription){
        this.wordId = wordId;
        this.wordName = wordName;
        this.wordSpeak = wordSpeak;
        this.wordEx = wordEx;
        this.wordDescription = wordDescription;
    }
}
