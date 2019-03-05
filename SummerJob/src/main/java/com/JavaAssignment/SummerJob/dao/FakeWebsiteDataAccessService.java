package com.JavaAssignment.SummerJob.dao;

import com.JavaAssignment.SummerJob.model.Website;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeWebsiteDataAccessService implements WebsiteDao {

    private static List<Website> DB = new ArrayList<>();

        @Override
    public int insertWebsite(UUID name, Website website) {
            DB.add(new Website(name, website.getUrl()));
        return 0;
    }

    @Override
    public int insertWebsite(UUID name, String url) {
        DB.add(new Website(name, website.getUrl));
        return 0;
    }
}
