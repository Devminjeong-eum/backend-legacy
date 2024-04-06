package com.example.devminjeongeum.domain.word.service;

import com.example.devminjeongeum.domain.word.dto.WordResponseDto;
import com.example.devminjeongeum.domain.word.entity.Word;
import com.example.devminjeongeum.domain.word.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public Page<WordResponseDto> getAllword(Pageable pageable) {
        Page<Word> wordPage  = wordRepository.findAll(pageable);
        return wordPage.map(word -> new WordResponseDto(
                word.getWordId(),
                word.getWordName(),
                word.getWordSpeak(),
                word.getWordEx(),
                word.getWordDescription()
        ));
    }
}
