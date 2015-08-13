package com.learning.avoidNestingForLoop;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/8/5.
 */
public class BallStatsAnalyst {
    public static List<BallColorStats> generateBallColorStats(List<Ball> balls) {
        List<BallColorStats> ballColorStatses = new ArrayList<BallColorStats>();
        for (Ball ball : balls) {
            if (isNewColor(ball.getColor(), ballColorStatses)) {
                BallColorStats ballColorStats = new BallColorStats();
                ballColorStats.setColor(ball.getColor());
                ballColorStatses.add(ballColorStats);
            }
        }
        return ballColorStatses;
    }

    private static boolean isNewColor(String color, List<BallColorStats> ballColorStatses) {
        for (BallColorStats ballColorStats : ballColorStatses) {
            if (ballColorStats.getColor().equals(color)) {
                return false;
            }
        }

        return true;
    }
    public static  List<BallColorStats> analysisBalls(List<Ball> balls){
        List<BallColorStats> ballColorStatses = generateBallColorStats(balls);
        //Important,want to avoid this nested for loop
        for (BallColorStats ballColorStats : ballColorStatses) {
            for (Ball ball : balls) {
                if (ball.getColor().equals(ballColorStats.getColor())) {
                    ballColorStats.incrementQuantity();
                    ballColorStats.addWeight(ball.getWeight());
                }
            }
        }
        return ballColorStatses;
    }
}
