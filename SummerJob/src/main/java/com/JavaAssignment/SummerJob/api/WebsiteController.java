package com.JavaAssignment.SummerJob.api;


import com.JavaAssignment.SummerJob.dao.FakeWebsiteDataAccessService;
import com.JavaAssignment.SummerJob.model.Website;
import com.JavaAssignment.SummerJob.service.WebsiteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RequestMapping("endpoint/1")
@RestController
public class WebsiteController {
    private final WebsiteService websiteService;

    @Autowired
    public WebsiteController(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    @PostMapping(value="/add/website/{name}/{url}")
    public String insertWebsite(@PathVariable("name") String name) {
        System.out.println("Ok "+ name + " added");
        return FakeWebsiteDataAccessService.getInstance().insertWebsite(name);

    @GetMapping(value = "/{name}")

}
