package org.blog.cms.core.dto;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.blog.cms.core.entity.Element;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ParagraphDto.class, name = "PARAGRAPH"),
        @JsonSubTypes.Type(value = ImageDto.class, name = "IMAGE"),
        @JsonSubTypes.Type(value = HeaderDto.class, name = "HEADER")
})
public sealed interface ElementDto permits HeaderDto, ImageDto, ParagraphDto{
    public Element toElement();
}
