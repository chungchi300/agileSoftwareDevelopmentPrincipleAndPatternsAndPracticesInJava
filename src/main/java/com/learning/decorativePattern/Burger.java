package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Burger implements BreakFast {
    private String description = "hamburger";
    public String getDescription(){
        return  this.description;
    }
    public int getCost(){
        return 20;
    }
}
