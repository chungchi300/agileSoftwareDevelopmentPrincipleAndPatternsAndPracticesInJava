package com.mycompany.app;

import com.learning.decorativePattern.BreakFast;
import com.learning.decorativePattern.Burger;
import com.learning.decorativePattern.Ham;

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
        assertEquals(30,burgetWithHam2.getCost());

    }
}
