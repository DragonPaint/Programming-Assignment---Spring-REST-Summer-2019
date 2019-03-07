package com.JavaAssignment.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService websiteService;

    @GetMapping
    public List<Website> getAllWebsites() {
        return websiteService.getAllWebsites();
    }

    @GetMapping("/getUrl")
    public Website getWebsite(@RequestParam(value = "name") String name) {
        return websiteService.getWebsite(name);
    }

//    @PatchMapping("/add")
 //   public String addWebsite(@RequestParam(value="name")String name , @RequestParam(value="url") String url){
   //     return websiteService.addWebsite(name, url);
   // }
}
