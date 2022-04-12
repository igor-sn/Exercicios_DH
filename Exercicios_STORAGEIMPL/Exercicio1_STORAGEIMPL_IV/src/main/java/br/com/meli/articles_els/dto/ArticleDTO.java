package br.com.meli.articles_els.dto;

import br.com.meli.articles_els.model.Article;
import br.com.meli.articles_els.model.Author;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ArticleDTO {
    private String id;
    private String title;
    @JsonSerialize
    @JsonDeserialize
    private List<Author> authorList;

    public static Article convert(ArticleDTO articleDTO){
        return new Article(articleDTO.id, articleDTO.title, articleDTO.authorList);
    }

    public static ArticleDTO convert(Article article){
        return new ArticleDTO(article.getId(), article.getTitle(), article.getAuthorList());
    }
}
