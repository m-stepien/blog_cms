package org.blog.cms.core.service;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.repository.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleDto getArticleById(long id){
        this.articleRepository.findById(Integer.valueOf(id)).orElseThrow();
    }
}
