package com.example.c4q.conscious.utility;

/**
 * Created by c4q on 3/31/18.
 */

public enum Host {
    BASEURL_THEY_SAID_SO("https://quotes.rest/");

    Host(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    String url;


    }
