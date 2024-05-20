package com.project.site.respository;

import com.project.site.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public interface SiteRepository extends JpaRepository<Site, Long> {
    List<Site> findAllByOrderById();
}
