package org.blog.cms.core.service;

import org.blog.cms.core.component.ArticleValidator;
import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.entity.Article;
import org.blog.cms.core.exception.NotFoundException;
import org.blog.cms.core.repository.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final ArticleValidator articleValidator;
    private final Logger logger = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    public ArticleService(ArticleRepository articleRepository, ArticleValidator articleValidator) {
        this.articleRepository = articleRepository;
        this.articleValidator = articleValidator;
    }

    public ArticleDto getArticleById(String id){
        Article article = this.articleRepository.findById(id).orElseThrow(()-> new NotFoundException("Could not found article with id " + id + " in database"));
        return article.toDto();
    }

    public void createArticle(ArticleDto articleDto){
        logger.info("Starting save operation");
        this.articleValidator.validate(articleDto);
        this.articleRepository.save(new Article(articleDto));
    }


}
