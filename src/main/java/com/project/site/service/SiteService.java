package com.project.site.service;


import com.project.site.dto.RequestDto;
import com.project.site.dto.ResponseAllDto;
import com.project.site.dto.ResponseDto;
import com.project.site.entity.Site;
import com.project.site.respository.SiteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    public List<ResponseAllDto> getContents() {
        return siteRepository.findAllByOrderById().stream().map(ResponseAllDto::new).toList();
    }

    @Transactional
    public ResponseDto updateContent(Long id,RequestDto requestDto) {
        Site site = siteRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택하신 글은 없는 메모입니다."));

        site.update(requestDto);
        ResponseDto responseDto = new ResponseDto(site);
        return responseDto;

    }
}
