//package com.shshteudev.graphql_docker_article_app.resolvers;
//
//import com.coxautodev.graphql.tools.GraphQLQueryResolver;
//import com.shshteudev.graphql_docker_article_app.models.Article;
//import com.shshteudev.graphql_docker_article_app.repository.ArticleRepository;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Slf4j
//@AllArgsConstructor
//@Component
//public class ArticleQueryResolver implements GraphQLQueryResolver {
//    private ArticleRepository articleRepository;
//
//    public Optional<Article> getArticle(final String articleId) {
//        log.info("Get article by ID {}", articleId);
//        return articleRepository.findById(articleId);
//    }
//
//    public List<Article> getArticles() {
//        log.info("Get all articles");
//        return articleRepository.findAll();
//    }
//}
