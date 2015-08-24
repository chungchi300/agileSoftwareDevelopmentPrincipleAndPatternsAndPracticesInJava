package com.mycompany.app;

import com.learning.state.BasketBallPlayer;
import com.learning.state.Normal;
import com.learning.state.PrepareShooting;

/**
 * Created by Administrator on 2015/7/7.
Presenter
 */

public class TestStatePattern extends BaseTestCase {
    public void testT(){
        //starting
        BasketBallPlayer person = new BasketBallPlayer("jeff");
        //normal
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());

        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());
        //scoring
        person.playing();
        assertEquals(Normal.class, person.getGameState().getClass());
        //preparing
        person.playing();
        assertEquals(PrepareShooting.class, person.getGameState().getClass());

    }
}
