package com.learning.adapter;

/**
 * Created by aigens on 25/8/2015.
 */
public class JsonHttpAdapter {
    private final HttpLoader httpLoader;
    private String entity;
    public JsonHttpAdapter() {
        this.httpLoader = new HttpLoader();
    }

    public void load(String s) {
    entity =     this.httpLoader.useKeyToGetValue("jsonEntity");
    }

    public boolean hasEntity() {
        return (entity!=null);
    }
}
