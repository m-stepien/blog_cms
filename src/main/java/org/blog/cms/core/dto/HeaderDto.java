package org.blog.cms.core.dto;

import org.blog.cms.core.entity.Element;
import org.blog.cms.core.entity.ElementType;
import org.blog.cms.core.entity.Header;

public record HeaderDto(ElementType type, int level, String text) implements ElementDto{
    @Override
    public Element toElement() {
        return new Header(this.type, this.level, this.text);
    }
}
