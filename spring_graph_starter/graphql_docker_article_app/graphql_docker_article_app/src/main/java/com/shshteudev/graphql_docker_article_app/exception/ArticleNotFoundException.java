package com.shshteudev.graphql_docker_article_app.exception;

public class ArticleNotFoundException extends RuntimeException {
    private final String articleId;
    public ArticleNotFoundException(String message, String id) {
        super(message);
        this.articleId = id;
    }
}
