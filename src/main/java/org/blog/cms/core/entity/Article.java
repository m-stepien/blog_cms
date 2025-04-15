package org.blog.cms.core.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "article")
public class Article {
    @id
    int id;
    String header;
    List<Element> elements;
    LocalDate creationDate;
}
