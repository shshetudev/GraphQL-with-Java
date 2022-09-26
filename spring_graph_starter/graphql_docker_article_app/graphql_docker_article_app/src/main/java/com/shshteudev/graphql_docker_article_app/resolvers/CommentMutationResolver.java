//package com.shshteudev.graphql_docker_article_app.resolvers;
//
//import com.coxautodev.graphql.tools.GraphQLMutationResolver;
//import com.shshteudev.graphql_docker_article_app.exception.ArticleNotFoundException;
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
//@Slf4j
//@AllArgsConstructor
//@Component
//public class CommentMutationResolver implements GraphQLMutationResolver {
//    private ArticleRepository articleRepository;
//
//    public Article addComment(String id, String text) {
//        log.info("Add comment {} to the article of id {}", text, id);
//        return articleRepository.findById(id).map(article -> addComment(article, text))
//                .orElseThrow(() -> new ArticleNotFoundException("Article is not found", id));
//    }
//
//    private Article addComment(Article article, String text) {
//        Optional.ofNullable(article.getComments())
//                .ifPresentOrElse(comments -> comments.add(new Comment(text)), () -> article.setComments(List.of(new Comment(text))));
//        return articleRepository.save(article);
//    }
//}
