package org.blog.cms.core.controller;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<ArticleDto> getArticle(@RequestParam("id") long id) {
        ArticleDto article = this.articleService.getArticleById(id);
        return ResponseEntity.ok(article);
    }

    @PostMapping("/new")
    public ResponseEntity<String> createNewArticle(@RequestBody ArticleDto newArticle){
    }
}
