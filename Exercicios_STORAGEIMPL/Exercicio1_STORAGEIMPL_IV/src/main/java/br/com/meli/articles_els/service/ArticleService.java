package br.com.meli.articles_els.service;

import br.com.meli.articles_els.model.Article;
import br.com.meli.articles_els.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    public Article saveArticle(Article article){
        return articleRepository.save(article);
    }

    public List<Article> getAllArticles(){
        return StreamSupport
                .stream(
                articleRepository
                        .findAll()
                        .spliterator(), false)
                .collect(Collectors.toList());
    }

}
