package org.blog.cms.core.dto;

import org.blog.cms.core.entity.ElementType;

public record HeaderDto(ElementType type, int level, String text) implements ElementDto{
}
