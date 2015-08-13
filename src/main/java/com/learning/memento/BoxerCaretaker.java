package com.learning.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/13.
 */
public class BoxerCaretaker {
    List<BoxerMemento> boxerMementos = new ArrayList<BoxerMemento>();
    public void addBoxerMemento(BoxerMemento boxerMemento){
        this.boxerMementos.add(boxerMemento);
    }
    public BoxerMemento getBoxerMementoAt(int position){
        return this.boxerMementos.get(position);
    }
}
