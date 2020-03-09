package com.palina.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "palina.title")
public class TitleProperties {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String webSiteFullUrl) {
        this.url = webSiteFullUrl;
    }
}
