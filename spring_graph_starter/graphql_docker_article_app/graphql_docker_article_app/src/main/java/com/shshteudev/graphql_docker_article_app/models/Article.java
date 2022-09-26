package com.shshteudev.graphql_docker_article_app.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
@Builder
public class Article {
    @Id
    private String id;
    private String title;
    private String text;
    private String thumbnail;
    private List<Comment> comments;
}
