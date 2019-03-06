package com.JavaAssignment.SummerJob.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Website {
    private final String name;
    private final String url;
    private final Integer searches;

    public Website(@JsonProperty("name") String name,
                   @JsonProperty("url") String url,
                   @JsonProperty("searches") Integer searches) {
        this.name = name;
        this.url = url;
        this.searches = searches;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Integer getSerches() {
        return searches;
    }
}


