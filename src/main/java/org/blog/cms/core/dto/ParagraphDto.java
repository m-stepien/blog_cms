package org.blog.cms.core.dto;

import org.blog.cms.core.entity.ElementType;
import org.blog.cms.core.entity.Subtext;

import java.util.List;

public record ParagraphDto(ElementType type, List<Subtext> content) implements ElementDto{
}
