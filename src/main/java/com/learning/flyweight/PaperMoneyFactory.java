package com.learning.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by aigens on 1/9/2015.
 */
public class PaperMoneyFactory {
    private static Map<Integer,PaperMoney> paperMoneyFlyweightPool = new HashMap<Integer,PaperMoney>();
    public static Map<Integer,PaperMoney> getPaperMoneyFlyweightPoolForTestOnly(){
        return paperMoneyFlyweightPool;
    }
    public static PaperMoney makePaperMoney(PaperMoneyType paperMoneyType){
        PaperMoney mapLocatedPaperMoney;
        switch (paperMoneyType){
            case FiftyDollarPaper:
                mapLocatedPaperMoney = paperMoneyFlyweightPool.get(50);
                if(mapLocatedPaperMoney==null){
                    PaperMoney paperMoney = new FiftyDollar();
                    paperMoneyFlyweightPool.put(50,paperMoney);
                    mapLocatedPaperMoney = paperMoney;
                }else{
                    mapLocatedPaperMoney.setId(UUID.randomUUID().toString());
                }

                break;
            case HundredDollarPaper:
                mapLocatedPaperMoney = paperMoneyFlyweightPool.get(100);
                if(mapLocatedPaperMoney==null){
                    PaperMoney paperMoney = new FiftyDollar();
                    paperMoneyFlyweightPool.put(100,paperMoney);
                    mapLocatedPaperMoney = paperMoney;
                }else{
                    mapLocatedPaperMoney.setId(UUID.randomUUID().toString());
                }

                break;
             default:
                throw  new RuntimeException("not a paper money");

        }
        return mapLocatedPaperMoney;
    }
}
