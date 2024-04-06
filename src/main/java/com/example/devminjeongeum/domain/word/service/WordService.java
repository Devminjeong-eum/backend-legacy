package com.example.devminjeongeum.domain.word.service;

import com.example.devminjeongeum.domain.word.dto.WordAllResponseDto;
import com.example.devminjeongeum.domain.word.dto.WordResponseDto;
import com.example.devminjeongeum.domain.word.dto.WordSelectResponseDto;
import com.example.devminjeongeum.domain.word.entity.Word;
import com.example.devminjeongeum.domain.word.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public Page<WordResponseDto> getAllword(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Word> wordPage  = wordRepository.findAll(pageable);
        return wordPage.map(WordResponseDto::new);
    }

    public WordSelectResponseDto getWordSelect(Long wordId) {
        Word wordSelect = wordRepository.findById(wordId).orElseThrow(() -> new IllegalArgumentException("단어가 없습니다."));
        return new WordSelectResponseDto(wordSelect);
    }
}
