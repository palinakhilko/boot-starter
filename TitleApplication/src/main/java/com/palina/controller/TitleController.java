package com.palina.controller;

import com.palina.service.WebSiteTitleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    private final WebSiteTitleService webSiteTitleService;

    public TitleController (WebSiteTitleService webSiteTitleService) {
        this.webSiteTitleService = webSiteTitleService;;
    }

    @GetMapping("/title")
    public String showTitle() {
        return webSiteTitleService.getWebSiteTitle();
    }
}
