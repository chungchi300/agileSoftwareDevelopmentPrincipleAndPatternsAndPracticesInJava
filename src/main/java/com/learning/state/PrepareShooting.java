package com.learning.state;

/**
 * Created by aigens on 24/8/2015.
 */
public class PrepareShooting implements GameState {
    public void changeGameState(BasketBallPlayer person) {

            person.setGameState(new Normal());

    }
    public void score(BasketBallPlayer person) {
        System.out.println("2 points shooted");
        this.changeGameState(person);
    }
}
