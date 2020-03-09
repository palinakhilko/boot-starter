package com.palina.config;

import com.palina.service.WebSiteTitleService;
import com.palina.service.WebSiteTitleServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TitleConfig {

    @Value("${palina.title.url}")
    private String webSiteUrl;

    public WebSiteTitleService webSiteTitleService() {
        return new WebSiteTitleServiceImpl(webSiteUrl);
    }
}
