package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ElementDto;
import org.blog.cms.core.dto.HeaderDto;

public class Header extends Element{
    private int level;
    private String text;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public ElementDto toDto() {
        return new HeaderDto(this.getType(), this.getLevel(), this.getText());
    }
}
