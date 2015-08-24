package com.learning.state;

/**
 * Created by aigens on 24/8/2015.
 */
public class Start implements GameState {

    public void changeGameState(BasketBallPlayer person) {

        person.setGameState(new Normal());

    }

    public void score(BasketBallPlayer person) {
        System.out.println("Start in the game");
        this.changeGameState(person);
    }
}
