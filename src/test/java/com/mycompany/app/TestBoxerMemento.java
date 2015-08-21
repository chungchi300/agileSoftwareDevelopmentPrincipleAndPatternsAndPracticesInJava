package com.mycompany.app;

import com.learning.memento.BoxerCaretaker;
import com.learning.memento.BoxerMemento;
import com.learning.memento.BoxerOriginator;

/**
 * Created by Administrator on 2015/7/7.
 */
public class TestBoxerMemento extends BaseTestCase {

    public void testBoxerMemento() {
        BoxerOriginator rocky = new BoxerOriginator("rocky", 100);
        assertTrue(rocky.isAlive());
        BoxerCaretaker boxerCaretaker = new BoxerCaretaker();
        boxerCaretaker.addBoxerMemento(rocky.createMemento());
        rocky.takeAHeavyStrike();
        rocky.takeAHeavyStrike();
        //take two heavy strike cause death
        assertFalse(rocky.isAlive());
        BoxerMemento boxerMemento = boxerCaretaker.getBoxerMementoAt(0);
        rocky.restoreFromMemento(boxerMemento);
        //rocky is back to alive
        assertTrue(rocky.isAlive());
        assertEquals(100,rocky.getHp());
    }
}
