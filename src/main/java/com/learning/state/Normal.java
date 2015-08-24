package com.learning.state;

/**
 * Created by aigens on 24/8/2015.
 */
public class Normal implements GameState {

    public void changeGameState(BasketBallPlayer person) {

            person.setGameState(new PrepareShooting());

    }

    public void score(BasketBallPlayer person) {
        System.out.println("2 points preparing");
        this.changeGameState(person);
    }
}
