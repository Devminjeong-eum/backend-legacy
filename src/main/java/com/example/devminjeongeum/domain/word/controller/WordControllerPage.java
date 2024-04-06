package com.example.devminjeongeum.domain.word.controller;

import com.example.devminjeongeum.domain.word.dto.WordResponseDto;
import com.example.devminjeongeum.domain.word.entity.Word;
import com.example.devminjeongeum.domain.word.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class WordControllerPage {

    private final WordService wordService;

    @GetMapping("/words")
    public String wordAll(Model model, @PageableDefault(page = 0, size = 20, sort ="id", direction = Sort.Direction.ASC) Pageable pageable){
        Page<WordResponseDto> wordResponseDtoPage = wordService.getAllword(pageable);
        model.addAttribute("wordList", wordResponseDtoPage);
        return "Allword";
    }

    @GetMapping("/word/{wordId}")
    public String wordSelect(Model model,@PathVariable Long wordId){
        Word word = wordService.getWordSelect(wordId);
        model.addAttribute("word", word);
        return "Selectword";
    }
}
