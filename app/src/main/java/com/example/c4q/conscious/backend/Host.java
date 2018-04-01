package com.example.c4q.conscious.backend;

/**
 * Created by c4q on 3/31/18.
 */

public enum Host {
    BASEURL_THEY_SAID_SO(" http://quotes.rest/qod/");

    Host(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    String url;


    }
