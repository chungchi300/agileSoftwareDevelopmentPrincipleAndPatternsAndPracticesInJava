package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Sandwich implements BreakFast {
    private String description = "Sandwich";
    public String getDescription(){
        return this.description;
    }
    public int getCost(){
        return 10;
    }
}
