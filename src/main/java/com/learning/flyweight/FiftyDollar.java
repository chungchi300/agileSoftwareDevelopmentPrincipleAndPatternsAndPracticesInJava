package com.learning.flyweight;

import java.util.UUID;

/**
 * Created by aigens on 1/9/2015.
 */
public class FiftyDollar implements PaperMoney{

    public String id =  UUID.randomUUID().toString();
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int getValue() {
        return 50;
    }


}
