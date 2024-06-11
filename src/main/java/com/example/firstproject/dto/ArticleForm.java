package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드

    public Article toEntity() {
        // 폼 데이터를 담은 DTO 객체를 Article 엔티티로 변환
        return new Article(id, title, content);
    }
}
