package com.learning.chainOfResponsibility;

/**
 * Created by aigens on 31/8/2015.
 */
public abstract class Employee  {
    private Employee greaterPowerEmployee;

    public Employee getGreaterPowerEmployee() {
        return greaterPowerEmployee;
    }

    public void setGreaterPowerEmployee(Employee greaterPowerEmployee) {
        this.greaterPowerEmployee = greaterPowerEmployee;
    }
    public boolean handleCustomerProblem(int problemSize){
        return false;
    }
}
