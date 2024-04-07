package com.example.devminjeongeum.domain.word.controller;

import com.example.devminjeongeum.domain.word.dto.WordAllResponseDto;
import com.example.devminjeongeum.domain.word.dto.WordResponseDto;
import com.example.devminjeongeum.domain.word.dto.WordSelectResponseDto;
import com.example.devminjeongeum.domain.word.entity.Word;
import com.example.devminjeongeum.domain.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WordController {

    private final WordService wordService;

    @GetMapping("/words")
    public ResponseEntity<WordAllResponseDto> wordAll(@RequestParam(defaultValue = "0") int page,
                                                      @RequestParam(defaultValue = "10") int size){
        Page<WordResponseDto> wordPage = wordService.getAllword(page -1,size);
        return ResponseEntity.ok().body(new WordAllResponseDto(wordPage));
    }

    @GetMapping("/word/{wordId}")
    public ResponseEntity<WordSelectResponseDto> wordSelect(@PathVariable Long wordId){
        WordSelectResponseDto word = wordService.getWordSelect(wordId);
        return ResponseEntity.ok().body(word);
    }

    @GetMapping("/word/search")
    public ResponseEntity<WordAllResponseDto> wordSearch(@RequestParam(defaultValue = "0") int page,
                                             @RequestParam(defaultValue = "10") int size,
                                             @RequestParam String wordName){
        Page<WordResponseDto> wordSearch = wordService.getWordSearch(wordName,page-1,size);
        return ResponseEntity.ok().body(new WordAllResponseDto(wordSearch));
    }
}
