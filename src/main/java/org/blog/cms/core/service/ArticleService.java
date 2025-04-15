package org.blog.cms.core.service;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.entity.Article;
import org.blog.cms.core.exception.NotFoundException;
import org.blog.cms.core.repository.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleDto getArticleById(int id){
        Article article = this.articleRepository.findById(Integer.valueOf(id)).orElseThrow(()->{
                throw new NotFoundException("Could not found article with id " +id+" in database");});
        return article.toDto();
    }
}
