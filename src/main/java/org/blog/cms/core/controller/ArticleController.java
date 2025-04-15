package org.blog.cms.core.controller;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/article")
@RestController
public class ArticleController {
    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticle(@PathVariable("id") String id) {
        ArticleDto article = this.articleService.getArticleById(id);
        return ResponseEntity.ok(article);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createArticle(@RequestBody ArticleDto articleDto){
        this.articleService.createArticle(articleDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
