package com.JavaAssignment.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService websiteService;
    //  "Input with POST through JSON at localhost:8080/add"
    //  "Get individual object through localhost:8080/getUrl?name={name of saved url}"
    //  "Get all objects through localhost:8080/getAll"



    @GetMapping("/getAll")
    public List<Website> getAllWebsites() {
        return websiteService.getAllWebsites();
    }

    @GetMapping("/getUrl")
    public Website getWebsite(@RequestParam(value = "name") String name) {
        return websiteService.getWebsite(name);
    }

    @PostMapping("/add")
    public void addWebsite(@RequestBody Website website){
         websiteService.addWebsite(website);
    }
}
