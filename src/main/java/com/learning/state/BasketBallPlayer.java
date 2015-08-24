package com.learning.state;

/**
 * Created by aigens on 24/8/2015.
 */
public class BasketBallPlayer {
    String name;
    GameState gameState;

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }


    public BasketBallPlayer(String name) {
        this.name = name;

        this.gameState = new Start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void playing() {
        this.gameState.score(this);

    }

}
