package com.shshteudev.graphql_docker_article_app.config;

import com.shshteudev.graphql_docker_article_app.models.Article;
import com.shshteudev.graphql_docker_article_app.models.Comment;
import com.shshteudev.graphql_docker_article_app.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.stream.IntStream;

// todo: Uncomment this class if you are willing to run in local db instead of docker
//@AllArgsConstructor
//@Slf4j
//@Component
//public class DatabaseInitializationConfig {
//    private final Faker faker = new Faker();
//    private final ArticleRepository articleRepository;
//
//    @PostConstruct
//    public void initDatabase() {
//        log.info("Starting database initialization");
//        IntStream.range(1, 3).forEach(i -> articleRepository.save(buildArticle()));
//    }
//
//    private Article buildArticle() {
//        return Article.builder()
//                .title(faker.book().title())
//                .text(faker.chuckNorris().fact())
//                .comments(Collections.singletonList(new Comment(faker.ancient().hero())))
//                .build();
//    }
//}
