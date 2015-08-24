package com.learning.state;

/**
 * Created by aigens on 24/8/2015.
 */
public interface GameState {
    void changeGameState(BasketBallPlayer person);

    void score(BasketBallPlayer person);
}
