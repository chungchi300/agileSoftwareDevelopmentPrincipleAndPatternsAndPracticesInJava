package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Ham implements BreakFastDecorator {
    private BreakFast breakFast;

    public Ham(BreakFast breakFast) {
        this.breakFast = breakFast;
    }

    public String getDescription() {
       return "Ham"+this.breakFast.getDescription();

    }

    public int getCost() {
        return this.breakFast.getCost() + 5;
    }
}
