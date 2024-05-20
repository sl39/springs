package com.project.site.controller;

import com.project.site.dto.RequestDto;
import com.project.site.dto.ResponseAllDto;
import com.project.site.dto.ResponseDto;
import com.project.site.service.SiteService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<ResponseAllDto> getContents(){
        List<ResponseAllDto> contents = siteService.getContents();
        return contents;
    }

    @PutMapping("/{id}")
    public ResponseDto createContent(@PathVariable Long id, @RequestBody RequestDto requestDto){
        ResponseDto content = siteService.updateContent(id,requestDto);
        return content;
    }


}
