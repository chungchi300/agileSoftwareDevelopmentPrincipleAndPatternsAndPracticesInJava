package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Ham implements BreakFastDecorator {
    private BreakFast breakFast;

    public Ham(BreakFast breakFast) {
        this.breakFast = breakFast;
    }

    public void getDescription() {
        this.breakFast.getDescription();
        System.out.println(" + Ham");
    }

    public int getCost() {
        return this.breakFast.getCost() + 5;
    }
}
