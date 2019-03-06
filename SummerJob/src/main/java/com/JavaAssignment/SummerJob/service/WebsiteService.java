package com.JavaAssignment.SummerJob.service;

import com.JavaAssignment.SummerJob.dao.WebsiteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WebsiteService {

    private final WebsiteDao websiteDao;

    @Autowired
    public WebsiteService(@Qualifier("fakeDao") WebsiteDao websiteDao) {
        this.websiteDao = websiteDao;
    }


}
