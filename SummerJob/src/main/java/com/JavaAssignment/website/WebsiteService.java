package com.JavaAssignment.website;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class WebsiteService {

    private List<Website> Websites = Arrays.asList(
            new Website("google", "https://www.google.se/"),
            new Website("email", "https://mail.google.com")
    );

    public List<Website> getAllWebsites() {
        return Websites;
    }

    public Website getWebsite(String name) {
        return Websites.stream().filter(website -> website.getName().equals(name)).findFirst().get();
    }


}
