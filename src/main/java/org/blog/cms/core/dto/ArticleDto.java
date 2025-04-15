package org.blog.cms.core.dto;

import java.time.LocalDate;
import java.util.List;

public record ArticleDto(
        int id, List<ElementDto> elements, LocalDate creationDate
        ) {}
