package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Egg implements BreakFastDecorator {
    private BreakFast breakFast;

    public Egg(BreakFast breakFast) {
        this.breakFast = breakFast;
    }

    public String getDescription() {
       return "Egg"+this.breakFast.getDescription();
    }

    public int getCost() {
        return this.breakFast.getCost() + 3;
    }
}
