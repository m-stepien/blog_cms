package org.blog.cms.core.dto;

import org.blog.cms.core.entity.Element;
import org.blog.cms.core.entity.ElementType;
import org.blog.cms.core.entity.Image;

public record ImageDto(ElementType type, String url, String altText, String caption) implements ElementDto{
    @Override
    public Element toElement() {
        return new Image(this.type, this.url, this.altText, this.caption);
    }
}
