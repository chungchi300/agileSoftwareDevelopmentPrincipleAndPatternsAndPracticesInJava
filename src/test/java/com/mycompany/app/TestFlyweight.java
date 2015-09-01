package com.mycompany.app;

import com.learning.flyweight.PaperMoneyFactory;
import com.learning.flyweight.PaperMoneyType;

/**
 * Created by aigens on 1/9/2015.
 */
public class TestFlyweight extends BaseTestCase{
    public void testGettingManyObject(){

        for(int i = 0;i < 100;i++){
            ll(PaperMoneyFactory.makePaperMoney(PaperMoneyType.FiftyDollarPaper).getId());
            ll(PaperMoneyFactory.makePaperMoney(PaperMoneyType.HundredDollarPaper).getId());
        }
        ll("number of paperMoney" + PaperMoneyFactory.getPaperMoneyFlyweightPoolForTestOnly().size());
    }
}
