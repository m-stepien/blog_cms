package org.blog.cms.core.dto;

import org.blog.cms.core.entity.Element;
import org.blog.cms.core.entity.ElementType;
import org.blog.cms.core.entity.Paragraph;
import org.blog.cms.core.entity.Subtext;

import java.util.List;

public record ParagraphDto(ElementType type, List<Subtext> content) implements ElementDto{
    @Override
    public Element toElement() {
        return new Paragraph(type, content);
    }
}
