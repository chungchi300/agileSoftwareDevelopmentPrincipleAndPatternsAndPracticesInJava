package com.learning.prototype;

/**
 * Created by aigens on 2/9/2015.
 */
public class Pig implements Life {
    @Override
    public Life cloneByDNA() {
        return new Pig();
    }
}
