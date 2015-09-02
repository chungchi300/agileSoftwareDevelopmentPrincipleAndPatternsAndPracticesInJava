package com.learning.prototype;

/**
 * Created by aigens on 2/9/2015.
 */
public class Sheep implements Life {

    @Override
    public Life cloneByDNA() {
        return new Sheep();
    }
}
