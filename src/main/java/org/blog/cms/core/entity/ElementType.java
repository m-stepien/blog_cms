package org.blog.cms.core.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum ElementType {
    HEADER("HEADER"),
    SUBHEADER("SUBHEADER"),
    PARAGRAPH("PARAGRAPH"),
    MEDIA("MEDIA"),
    LIST("LIST");

    private final String value;

    ElementType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ElementType fromString(String value) {
        try {
            return ElementType.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new IllegalArgumentException("Invalid ElementType: " + value);
        }
    }

    @JsonCreator
    public static ElementType fromJson(String value) {
        return fromString(value);
    }
}
