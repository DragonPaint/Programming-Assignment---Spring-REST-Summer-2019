package JavaAssignment.Website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WebsiteService {
    @Autowired
    private WebsiteRepository websiteRepository;


    public List<Website> getAll(){
        return websiteRepository.findAll();
    }

    public Website getByName(String name){
        return websiteRepository.findByName(name);
    }
}
