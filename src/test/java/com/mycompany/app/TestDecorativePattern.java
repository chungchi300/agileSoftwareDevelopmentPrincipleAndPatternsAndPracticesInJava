package com.mycompany.app;

import com.learning.decorativePattern.*;

/**
 * Created by Administrator on 2015/8/10.
 */
public class TestDecorativePattern extends BaseTestCase {
    public void testPureBurger(){
        //allow plain
        BreakFast burger = new Burger();

        assertEquals(20,burger.getCost());
    }
    public void testHamBurger(){
        BreakFast burger = new Burger();
        BreakFast burgetWithHam = new Ham(burger);
        //allow modified behavior dynamically
        assertEquals(25,burgetWithHam.getCost());

    }
    public void testHamHamBurger(){
        BreakFast burger = new Burger();
        //allow modified behavior dynamically and repeatly

        BreakFast burgetWithHam = new Ham(burger);
        BreakFast burgetWithHam2 = new Ham(burgetWithHam);
        ll(burgetWithHam2.getDescription());
        assertEquals(30, burgetWithHam2.getCost());

    }
    public void testHamEggBurger(){
        BreakFast burger = new Burger();
        //allow modified behavior dynamically and repeatly

        BreakFast egg = new Egg(burger);
        BreakFast burgetWithHam2 = new Ham(egg);
        ll(burgetWithHam2.getDescription());
        assertEquals(28,burgetWithHam2.getCost());

    }
    public void testHamEggSandWich(){
        BreakFast burger = new Sandwich();
        //allow modified behavior dynamically and repeatly

        BreakFast egg = new Egg(burger);
        BreakFast burgetWithHam2 = new Ham(egg);
        ll(burgetWithHam2.getDescription());
        assertEquals(18,burgetWithHam2.getCost());

    }
}
