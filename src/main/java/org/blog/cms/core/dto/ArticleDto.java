package org.blog.cms.core.dto;

import java.time.LocalDate;
import java.util.List;

public record ArticleDto(
        String id, String title, List<ElementDto> elements, LocalDate creationDate
) {
}

