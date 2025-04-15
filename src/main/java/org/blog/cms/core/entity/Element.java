package org.blog.cms.core.entity;

import org.blog.cms.core.dto.ElementDto;

public abstract class  Element {
    private ElementType type;

    public Element() {
    }

    public Element(ElementType type) {
        this.type = type;
    }

    public void setType(ElementType type){
        this.type = type;
    }

    public ElementType getType(){
        return this.type;
    };

    public abstract ElementDto toDto();

}
