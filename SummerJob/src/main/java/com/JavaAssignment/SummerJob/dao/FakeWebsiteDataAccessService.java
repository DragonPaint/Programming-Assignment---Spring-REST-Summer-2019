package com.JavaAssignment.SummerJob.dao;

import com.JavaAssignment.SummerJob.model.Website;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("fakeDao")
public class FakeWebsiteDataAccessService implements WebsiteDao {

    private static List<Website> DB = new ArrayList<>();

// mabye change int to string
    @Override
    public String insertWebsite(String name, Website website, Integer searches) {
        DB.add(new Website(name, website.getUrl(),searches = 0));
        return "Ok";
    }
}

