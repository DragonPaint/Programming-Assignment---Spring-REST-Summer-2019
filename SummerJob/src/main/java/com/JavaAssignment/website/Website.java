package com.JavaAssignment.website;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Website {
    private String name;
    private String url;

    public Website(){

    }


    public Website(@JsonProperty("name") String name,
                   @JsonProperty("url") String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

}
