package br.com.meli.articles_els.controller;

import br.com.meli.articles_els.dto.ArticleDTO;
import br.com.meli.articles_els.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/article")
    public ResponseEntity<ArticleDTO> saveArticle(@RequestBody ArticleDTO articleDTO){
        return new ResponseEntity<>((ArticleDTO.convert(articleService.saveArticle(ArticleDTO.convert(articleDTO)))), HttpStatus.CREATED);
    }

    @GetMapping("/article")
    public ResponseEntity<List<ArticleDTO>> getAllArticles(){
        return ResponseEntity.ok(articleService.getAllArticles().stream().map(article -> ArticleDTO.convert(article)).collect(Collectors.toList()));
    }

}
