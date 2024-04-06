package com.example.devminjeongeum.domain.word.repository;

import com.example.devminjeongeum.domain.word.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
