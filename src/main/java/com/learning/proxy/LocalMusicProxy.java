package com.learning.proxy;

/**
 * Created by aigens on 24/8/2015.
 */
public class LocalMusicProxy implements Music {


    LocalMusic localMusic = null;
    String fileName;

    public LocalMusicProxy(String fileName) {
        this.fileName = fileName;

    }



    public void play() {
        if(localMusic == null){
            localMusic = new LocalMusic(fileName);
        }
        localMusic.play();
    }
}
