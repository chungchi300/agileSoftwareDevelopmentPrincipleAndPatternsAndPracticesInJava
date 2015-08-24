package com.learning.proxy;

/**
 * Created by aigens on 24/8/2015.
 */
public class LocalMusic implements Music {

    String fileName;
    public LocalMusic(String fileName) {
        this.fileName = fileName;
        this.preparing();
    }
    private void preparing() {
        System.out.println("preparing");
    }
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void play() {
        System.out.println(this.fileName+"playing");
    }
}
