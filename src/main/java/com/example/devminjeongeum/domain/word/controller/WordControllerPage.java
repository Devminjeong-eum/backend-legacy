package com.example.devminjeongeum.domain.word.controller;

import com.example.devminjeongeum.domain.word.dto.WordResponseDto;
import com.example.devminjeongeum.domain.word.entity.Word;
import com.example.devminjeongeum.domain.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class WordControllerPage {

    private final WordService wordService;

    @GetMapping("/words")
    public ResponseEntity<Map<String, Object>> wordAll(Model model,
                                                       @RequestParam(defaultValue = "0") int page,
                                                       @RequestParam(defaultValue = "10") int size){
        Page<Word> wordPage = wordService.getAllword(page -1,size);
        List<Word> wordList = wordPage.getContent();

        long totalItems = wordPage.getTotalElements();
        int offset = wordPage.getNumber();
        int pageSize = wordPage.getSize();
        int totalPages = wordPage.getTotalPages();

        Map<String, Object> response = new HashMap<>();
        response.put("data", wordList);
        response.put("total", totalItems);
        response.put("offset", offset);
        response.put("limit", pageSize);
        response.put("totalPages", totalPages);

        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/word/{wordId}")
    public String wordSelect(Model model,@PathVariable Long wordId){
        Word word = wordService.getWordSelect(wordId);
        model.addAttribute("word", word);
        return "Selectword";
    }
}
