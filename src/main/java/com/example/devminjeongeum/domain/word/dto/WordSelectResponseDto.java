package com.example.devminjeongeum.domain.word.dto;

import com.example.devminjeongeum.domain.word.entity.Word;
import lombok.Getter;

@Getter
public class WordSelectResponseDto {
    private final long wordId;
    private final String wordName;
    private final String wordDescription;
    private final String wordDiacritic;
    private final String wordSpeak;
    private final String wrongSpeak;
    private final String wordExample;

    public WordSelectResponseDto(Word word){
        this.wordId = word.getWordId();
        this.wordName = word.getWordName();
        this.wordDescription = word.getWordDescription();
        this.wordDiacritic = word.getWordDiacritic();
        this.wordSpeak = word.getWordSpeak();
        this.wrongSpeak = word.getWrongSpeak();
        this.wordExample = word.getWordExample();
    }
}
