package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ElementDto;
import org.blog.cms.core.dto.ImageDto;

public class Image extends Element {
    private String url;
    private String altText;
    private String caption;

    public Image() {
    }

    public Image(ElementType elementType, String url, String altText, String caption) {
        super(elementType);
        this.url = url;
        this.altText = altText;
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public ElementDto toDto() {
        return new ImageDto(this.getType(), this.getUrl(), this.getAltText(), this.getCaption());
    }
}
