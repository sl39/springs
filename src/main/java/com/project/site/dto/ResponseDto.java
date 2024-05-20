package com.project.site.dto;

import com.project.site.entity.Site;
import lombok.Getter;

@Getter
public class ResponseDto {
    Long id;
    String username;
    String title;
    String content;
    Long price;
    public ResponseDto(Site site) {
        this.id = site.getId();
        this.username = site.getUsername();
        this.title = site.getTitle();
        this.content = site.getContent();
        this.price = site.getPrice();
    }
}
