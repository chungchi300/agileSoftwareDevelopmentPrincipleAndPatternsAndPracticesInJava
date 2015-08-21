package com.employeeManagement.add;

import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.classification.SalariedAndCommissionedPaymentClassifcation;
import com.employee.payment.schedule.BiweeklyPaymentSchedule;
import com.employee.payment.schedule.PaymentSchedule;

/**
 * Created by Administrator on 2015/7/7.
 */
public class AddSalariedAndCommissionedEmployeeTransaction extends AddEmployeeTransaction{
    private final double salary;
    private final double commissionRate;

    public AddSalariedAndCommissionedEmployeeTransaction(int id, String name, String addresss, double salary,double commissionRate) {
        super(id,name,addresss);
        this.commissionRate = commissionRate;
        this.salary = salary;
    }

    public PaymentClassification getPaymentClassification() {
        return new SalariedAndCommissionedPaymentClassifcation(this.salary,this.commissionRate);
    }

    public PaymentSchedule getPaymentSchedule() {
        return new BiweeklyPaymentSchedule();
    }

 }
