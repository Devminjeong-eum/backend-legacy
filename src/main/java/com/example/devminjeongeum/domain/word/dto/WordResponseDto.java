package com.example.devminjeongeum.domain.word.dto;

import com.example.devminjeongeum.domain.word.entity.Word;
import lombok.Getter;

@Getter
public class WordResponseDto {
    private final long wordId;
    private final String wordName;
    private final String wordDescription;
    private final String wordSpeak;
    private final String wrongSpeak;
    private final String wordExample;

    public WordResponseDto(Word word){
        this.wordId = word.getWordId();
        this.wordName = word.getWordName();
        this.wordDescription = word.getWordDescription();
        this.wordSpeak = word.getWordSpeak();
        this.wrongSpeak = word.getWrongSpeak();
        this.wordExample = word.getWordExample();
    }
}
