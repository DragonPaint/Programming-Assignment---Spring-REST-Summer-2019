package com.JavaAssignment.SummerJob.model;

import java.util.UUID;

public class Website {
    private final UUID name;
    private final String url;
    private final Integer searches;

    public Website(UUID name, String url, Integer searches) {
        this.name = name;
        this.url = url;
        this.searches = searches;
    }

    public UUID getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Integer getSerches() {
        return searches;
    }
}


