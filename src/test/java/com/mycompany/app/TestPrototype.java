package com.mycompany.app;

import com.learning.prototype.Sheep;

/**
 * Created by aigens on 1/9/2015.
 */
public class TestPrototype extends BaseTestCase{
    public void testByMadScientist(){
        Sheep sheep = new Sheep();
        for(int i = 0;i < 10;i++){
            Sheep sheep1 = (Sheep) sheep.cloneByDNA();
            ll("sheep cloned");
        }

    }
}
