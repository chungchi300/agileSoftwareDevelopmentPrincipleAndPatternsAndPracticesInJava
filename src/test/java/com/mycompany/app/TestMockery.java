package com.mycompany.app;

import com.learning.mock.Beef;
import com.learning.mock.LevelABeefFoodDeterminer;

import static org.mockito.Mockito.*;

/**
 * Created by Administrator on 2015/7/30.
 */

//to enable independency of component
public class TestMockery extends BaseTestCase {
    //mockery in state testing
    public void testDetermineBigBeef() {
        //normally,we need to create a cow,kill it,and get the beef,if they have error,
        //it make this case fail,causing non-independent of this case
        //in the another side,we need to focus on how to create beef that weight is over 5000
        Beef beef = mock(Beef.class);
        when(beef.getWeight()).thenReturn(5001);
        assertTrue(LevelABeefFoodDeterminer.getInstance().determineIsBigBeef(beef));
    }

    public void testDetermineNonBigBeef() {
        //yolo
        Beef beef = mock(Beef.class);
        when(beef.getWeight()).thenReturn(4999);
        assertFalse(LevelABeefFoodDeterminer.getInstance().determineIsBigBeef(beef));
    }

    //mockery in behaviour testing
    public void testRunBigBeefCheck() {
//        //build
        Beef beef = mock(Beef.class);

        LevelABeefFoodDeterminer levelABeefFoodDeterminer = LevelABeefFoodDeterminer.getInstance();
        LevelABeefFoodDeterminer spyLevelABeefFoodDeterminer = spy(levelABeefFoodDeterminer);
        //execute
        spyLevelABeefFoodDeterminer.isLevelABeef(beef);
        //check,using mockery spy feature
        //checking when is call levelABeef,the determineIsBigBeef Called
        verify(spyLevelABeefFoodDeterminer).determineIsBigBeef(beef);


    }
}
