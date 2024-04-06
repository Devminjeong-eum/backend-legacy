package com.example.devminjeongeum.domain.word.entity;

import com.example.devminjeongeum.global.audit.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Word extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wordId;

    private String wordName;

    private String wordSpeak;

    private String wordEx;

    private String wordDescription;
}
