package com.mycompany.app;

import com.learning.avoidNestingForLoop.Ball;
import com.learning.avoidNestingForLoop.BallColorStats;
import com.learning.avoidNestingForLoop.BallStatsAnalyst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/7/30.
 */

public class TestCleanCodeJava extends BaseTestCase {
    public List<Ball> generateBalls() {
        List<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball("Red", 20));
        balls.add(new Ball("Red", 20));
        balls.add(new Ball("Red", 20));
        balls.add(new Ball("Red", 20));
        balls.add(new Ball("Red", 20));
        balls.add(new Ball("White", 20));
        balls.add(new Ball("White", 30));
        balls.add(new Ball("White", 30));
        balls.add(new Ball("White", 20));
        balls.add(new Ball("Blue", 50));
        balls.add(new Ball("Blue", 50));
        return balls;
    }

    public void testCalculateColorStatsByNestedForLoop() {
        //build
        List<Ball> balls = generateBalls();
        //execute
        List<BallColorStats> ballColorStatses = BallStatsAnalyst.analysisBalls(balls);
        //check
        for (BallColorStats ballColorStats : ballColorStatses) {
            if (ballColorStats.getColor().equals("Red")) {
                assertEquals(100.00,ballColorStats.getWeight());
                assertEquals(5,ballColorStats.getQuantity());

            }
            if (ballColorStats.getColor().equals("White")) {
                assertEquals(100.00,ballColorStats.getWeight());
                assertEquals( 4,ballColorStats.getQuantity());

            }
            if (ballColorStats.getColor().equals("Blue")) {
                assertEquals(100.00,ballColorStats.getWeight());
                assertEquals(2,ballColorStats.getQuantity() );

            }
        }
    }

}
