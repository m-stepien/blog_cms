package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ArticleDto;
import org.blog.cms.core.dto.ElementDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "article")
public class Article {
    @Id
    String id;
    String title;
    List<Element> elements;
    LocalDate creationDate;

    public Article(){
    }

    public Article(ArticleDto articleDto){
        this.title = articleDto.title();
        this.creationDate = articleDto.creationDate();
        this.elements = articleDto.elements().stream().map(ElementDto::toElement).toList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return new ArticleDto(this.getId(),this.getTitle(), this.elementDtos(), this.getCreationDate());
    }
}
