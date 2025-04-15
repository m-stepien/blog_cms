package org.blog.cms.core.dto;

import org.blog.cms.core.entity.ElementType;

public record ImageDto(ElementType type, String url, String altText, String caption) implements ElementDto{
}
