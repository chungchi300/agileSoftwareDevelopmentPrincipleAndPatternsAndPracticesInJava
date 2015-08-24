package com.mycompany.app;

import com.learning.proxy.LocalMusicProxy;
import com.learning.proxy.Music;

/**
 * Created by aigens on 24/8/2015.
 */
public class TestProxy extends BaseTestCase{
    public void testT(){
        Music music = new LocalMusicProxy("123.mp3");
        music.play();
        music.play();
        music.play();

    }
}
