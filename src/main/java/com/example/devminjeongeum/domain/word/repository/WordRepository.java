package com.example.devminjeongeum.domain.word.repository;

import com.example.devminjeongeum.domain.word.entity.Word;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {
    Page<Word> findByWordNameContaining(String wordName, Pageable pageable);
}
