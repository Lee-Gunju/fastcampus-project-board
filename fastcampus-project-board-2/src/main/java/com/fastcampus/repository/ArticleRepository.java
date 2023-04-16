package com.fastcampus.repository;

import com.fastcampus.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ArticleRepository extends JpaRepository<Article, Long> {
}