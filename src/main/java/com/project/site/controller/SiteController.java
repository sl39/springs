package com.project.site.controller;

import com.project.site.dto.RequestDto;
import com.project.site.dto.ResponseDto;
import com.project.site.service.SiteService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class SiteController {

    private final SiteService siteService;


    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }


    @PostMapping("")
    public ResponseDto createContent(@RequestBody RequestDto requestDto){
        ResponseDto content = siteService.createContent(requestDto);
        return content;
    }


}
