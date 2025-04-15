package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ElementDto;
import org.blog.cms.core.dto.ParagraphDto;

import java.util.List;

public class Paragraph extends Element{
    private List<Subtext> content;

    public List<Subtext> getContent() {
        return content;
    }

    @Override
    public ElementDto toDto() {
        return new ParagraphDto(this.getType(), this.getContent());
    }
}
