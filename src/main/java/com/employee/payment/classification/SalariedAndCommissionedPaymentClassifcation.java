package com.employee.payment.classification;

/**
 * Created by Administrator on 2015/7/7.
 */
public class SalariedAndCommissionedPaymentClassifcation implements PaymentClassification {
    private final double salary;
    private double commissionRate;

    public SalariedAndCommissionedPaymentClassifcation(double salary, double commissionRate) {
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
}
