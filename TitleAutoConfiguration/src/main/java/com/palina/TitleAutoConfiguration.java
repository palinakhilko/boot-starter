package com.palina;

import com.palina.config.TitleProperties;
import com.palina.service.WebSiteTitleService;
import com.palina.service.WebSiteTitleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TitleProperties.class)
public class TitleAutoConfiguration {

	@Autowired
	private TitleProperties titleProperties;

	@Bean
	public WebSiteTitleService webSiteTitleService() {
		return new WebSiteTitleServiceImpl(titleProperties.getUrl());
	}
}
