package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Sandwich implements BreakFast {
    public void getDescription(){
        System.out.println("Sandwich");
    }
    public int getCost(){
        return 10;
    }
}
