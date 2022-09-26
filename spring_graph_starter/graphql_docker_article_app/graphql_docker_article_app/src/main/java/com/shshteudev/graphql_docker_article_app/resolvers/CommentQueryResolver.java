//package com.shshteudev.graphql_docker_article_app.resolvers;
//
//import com.shshteudev.graphql_docker_article_app.models.Article;
//import com.shshteudev.graphql_docker_article_app.models.Comment;
//import com.shshteudev.graphql_docker_article_app.repository.ArticleRepository;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@AllArgsConstructor
//@Component
//@Slf4j
//public class CommentQueryResolver {
//    private ArticleRepository articleRepository;
//
//    public Optional<List<Comment>> getArticleComments(final String articleId) {
//        log.info("Get all comments of an article by articleId {}", articleId);
//        return articleRepository.findById(articleId).map(Article::getComments);
//    }
//}
