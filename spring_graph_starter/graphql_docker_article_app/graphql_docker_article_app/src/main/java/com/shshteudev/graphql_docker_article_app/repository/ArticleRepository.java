package com.shshteudev.graphql_docker_article_app.repository;

import com.shshteudev.graphql_docker_article_app.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
