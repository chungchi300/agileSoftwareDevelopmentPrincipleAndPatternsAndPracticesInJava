package com.employeeManagement.add;

import com.employee.payment.schedule.MonthlyPaymentSchedule;
import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.schedule.PaymentSchedule;
import com.employee.payment.classification.SalariedPaymentClassifcation;

/**
 * Created by Administrator on 2015/7/7.
 */
public class AddSalariedEmployeeTransaction extends AddEmployeeTransaction{
    private final double salary;

    public AddSalariedEmployeeTransaction(int id,String name,String addresss,double salary) {
        super(id,name,addresss);
        this.salary = salary;
    }

    public PaymentClassification getPaymentClassification() {
        return new SalariedPaymentClassifcation(this.salary);
    }

    public PaymentSchedule getPaymentSchedule() {
        return new MonthlyPaymentSchedule();
    }

 }
