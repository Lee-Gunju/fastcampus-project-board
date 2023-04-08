package com.fastcampus.repository;

import com.fastcampus.domain.Article;
import com.fastcampus.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
