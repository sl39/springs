package com.project.site.service;


import com.project.site.dto.RequestDto;
import com.project.site.dto.ResponseDto;
import com.project.site.entity.Site;
import com.project.site.respository.SiteRepository;
import org.springframework.stereotype.Service;

@Service
public class SiteService {

    private final SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository){
        this.siteRepository = siteRepository;
    }



    public ResponseDto createContent(RequestDto requestDto) {
        Site site = new Site(requestDto);

        Site saveSite = siteRepository.save(site);

        ResponseDto siteResponseDto = new ResponseDto(saveSite);
        return siteResponseDto;
    }
}
