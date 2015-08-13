package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Burger implements BreakFast {
    public void getDescription(){
        System.out.println("hamburger");
    }
    public int getCost(){
        return 20;
    }
}
