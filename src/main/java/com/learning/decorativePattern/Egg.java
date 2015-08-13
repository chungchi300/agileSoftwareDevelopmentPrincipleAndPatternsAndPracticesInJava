package com.learning.decorativePattern;

/**
 * Created by Administrator on 2015/8/10.
 */
public class Egg {
    private BreakFast breakFast;

    public Egg(BreakFast breakFast) {
        this.breakFast = breakFast;
    }

    public void getDescription() {
        this.breakFast.getDescription();
        System.out.println(" + £Å£ç£ç");
    }

    public int getCost() {
        return this.breakFast.getCost() + 50;
    }
}
