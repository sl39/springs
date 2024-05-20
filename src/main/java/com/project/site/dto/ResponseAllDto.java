package com.project.site.dto;

import com.project.site.entity.Site;
import lombok.Getter;

@Getter
public class ResponseAllDto {
    Long id;
    String username;
    String title;
    Long price;
    public ResponseAllDto(Site site) {
        this.id = site.getId();
        this.username = site.getUsername();
        this.title = site.getTitle();
        this.price = site.getPrice();
    }
}
