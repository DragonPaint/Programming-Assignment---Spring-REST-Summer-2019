package JavaAssignment.Website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebsiteController {

    @Autowired
    private WebsiteService websiteService;
    private WebsiteRepository websiteRepository;
    //  "Input with POST through JSON at localhost:8080/add"
    //  "Get individual object through localhost:8080/getUrl?name={name of saved url}"
    //  "Get all objects through localhost:8080/getAll"


    @GetMapping("/getAll")
    public List<Website> getAll() {
        return websiteService.getAll();
    }

    @GetMapping("/getUrl")
    public Website getWebsite(@RequestParam String name) {
        return websiteService.getByName(name);
    }

    @PostMapping("/add")
    public  void create(@RequestBody Website website){
        websiteRepository.save(website);
    }
}
