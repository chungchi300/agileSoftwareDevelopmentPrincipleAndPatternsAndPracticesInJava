package com.learning.chainOfResponsibility;

/**
 * Created by aigens on 31/8/2015.
 */
public class FrontlineEmployee extends  Employee {
    public boolean handleCustomerProblem(int problemSize){
        if(problemSize<10){
            System.out.println("handled by "+this.getClass().getSimpleName());
            return true;

        }else{
            System.out.println("passed to " + this.getGreaterPowerEmployee().getClass().getSimpleName());
            return this.getGreaterPowerEmployee().handleCustomerProblem(problemSize);
        }
    }
}
