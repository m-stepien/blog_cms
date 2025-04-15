package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.dto.ElementDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "article")
public class Article {
    @Id
    int id;
    String header;
    List<Element> elements;
    LocalDate creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    private List<ElementDto> elementDtos(){
        return this.getElements().stream().map(Element::toDto).toList();
    }

    public ArticleDto toDto(){
        return new ArticleDto(this.getId(), this.elementDtos(), this.getCreationDate());
    }
}
