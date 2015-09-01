package com.mycompany.app;

import com.learning.chainOfResponsibility.CEO;
import com.learning.chainOfResponsibility.FrontlineEmployee;
import com.learning.chainOfResponsibility.MiddleManager;

/**
 * Created by aigens on 31/8/2015.
 */
public class TestChainOfResponsibility extends BaseTestCase {
    public FrontlineEmployee buildCompany(){
        FrontlineEmployee frontlineEmployee = new FrontlineEmployee();
        MiddleManager middleManager = new MiddleManager();
        CEO ceo = new CEO();
        frontlineEmployee.setGreaterPowerEmployee(middleManager);
        middleManager.setGreaterPowerEmployee(ceo);
        return frontlineEmployee;
    }
    public void testHandleByFrontlineEmployee(){
        assertTrue(this.buildCompany().handleCustomerProblem(9));
    }
    public void testHandleByMiddleManager(){
        assertTrue(this.buildCompany().handleCustomerProblem(99));
    }
    public void testHandleByCEO(){
        assertTrue(this.buildCompany().handleCustomerProblem(999));
    }
    public void testHandleByFailed(){
        try{
            this.buildCompany().handleCustomerProblem(1000);
            assertNotReach();
        }catch (Exception exception){
           assertReach();
        }
    }

}
