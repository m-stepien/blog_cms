package org.blog.cms.core.dto;

import java.util.HashMap;

public record ElementDto(
        HashMap<String, String> properties;
) {
}
