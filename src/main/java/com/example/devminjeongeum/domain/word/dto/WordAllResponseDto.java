package com.example.devminjeongeum.domain.word.dto;

import lombok.Getter;
import org.springframework.data.domain.Page;

import java.util.List;

@Getter
public class WordAllResponseDto {
    private final List<WordResponseDto> wordAll;
    private final long totalItems;
    private final int offset;
    private final int pageSize ;
    private final int totalPages;

    public WordAllResponseDto(Page<WordResponseDto> wordPage) {
        this.wordAll = wordPage.getContent();
        this.totalItems = wordPage.getTotalElements();
        this.offset = wordPage.getNumber();
        this.pageSize = wordPage.getSize();
        this.totalPages = wordPage.getTotalPages();
    }
}
