package com.learning.memento;

/**
 * Created by Administrator on 2015/8/13.
 */
public class BoxerOriginator {
    //is alive is encapsulated
    private boolean isAlife;
    private String name = "";
    private int hp;

    public BoxerOriginator(String name, int hp) {
        this.name = name;
        this.hp = hp;
        updateAlife();
    }

    private void updateAlife() {
        isAlife = (hp > 0);
    }
    public void restoreFromMemento(BoxerMemento boxerMemento){
        this.hp = boxerMemento.getHp();
        this.name = boxerMemento.getName();
    }
    public BoxerMemento createMemento() {
        BoxerMemento boxerMemento = new BoxerMemento();
        boxerMemento.setHp(hp);
        boxerMemento.setName(name);
        return  boxerMemento;
    }

    @Override
    public String toString() {
        return "BoxerOriginator{" +
                "isAlife=" + isAlife +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
