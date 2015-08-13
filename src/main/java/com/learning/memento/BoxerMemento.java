package com.learning.memento;

/**
 * Created by Administrator on 2015/8/13.
 */
public class BoxerMemento {

    private String name;
    private int hp;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}