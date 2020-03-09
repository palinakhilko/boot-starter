package com.palina.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class WebSiteTitleServiceImpl implements WebSiteTitleService {

    private final String webSiteUrl;

    public WebSiteTitleServiceImpl (String webSiteUrl) {
        this.webSiteUrl = webSiteUrl;
    }

    public String getWebSiteTitle() {
        InputStream response = null;
        try {
            response = new URL(webSiteUrl).openStream();
            Scanner scanner = new Scanner(response);
            String responseBody = scanner.useDelimiter("\\A").next();
            return responseBody.substring(responseBody.indexOf("<title>") + 7, responseBody.indexOf("</title>"));
        } catch (IOException  ex) {
            return "Cannot get title from provided URL!";
        } finally {
            try {
                response.close();
            } catch (IOException ex) {
                return"Cannot get title from provided URL!";
            }
        }
    }
}
