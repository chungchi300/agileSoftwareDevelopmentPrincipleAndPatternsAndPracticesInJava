package com.learning.mock;

/**
 * Created by Administrator on 2015/7/30.
 */
public class LevelABeefFoodDeterminer {
    private static LevelABeefFoodDeterminer ourInstance = new LevelABeefFoodDeterminer();

    public static LevelABeefFoodDeterminer getInstance() {
        return ourInstance;
    }

    private LevelABeefFoodDeterminer() {
    }

    public boolean isLevelABeef(Beef beef) {
        return (determineIsBigBeef(beef)) ? true : false;
    }

    public boolean determineIsBigBeef(Beef beef) {
        if (beef.getWeight() > 5000) {
            return true;
        } else {
            return false;
        }
    }

}
