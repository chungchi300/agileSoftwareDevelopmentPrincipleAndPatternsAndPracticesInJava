package com.learning.memento;

/**
 * Created by Administrator on 2015/8/13.
 */
public class BoxerOriginator {
    //is alive is encapsulated
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    private String name = "";
    private int hp;

    public BoxerOriginator(String name, int hp) {
        this.name = name;
        this.hp = hp;
        updateAlive();
    }

    private void updateAlive() {
        isAlive = (hp > 0);
    }

    public void restoreFromMemento(BoxerMemento boxerMemento) {
        this.hp = boxerMemento.getHp();
        this.name = boxerMemento.getName();
        updateAlive();
    }

    public BoxerMemento createMemento() {
        BoxerMemento boxerMemento = new BoxerMemento();
        boxerMemento.setHp(hp);
        boxerMemento.setName(name);
        return boxerMemento;
    }

    public void takeAHeavyStrike() {
        this.hp -= 75;
        updateAlive();
    }

    @Override
    public String toString() {
        return "BoxerOriginator{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
