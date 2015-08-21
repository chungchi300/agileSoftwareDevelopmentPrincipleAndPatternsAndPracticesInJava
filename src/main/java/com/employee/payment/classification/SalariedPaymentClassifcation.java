package com.employee.payment.classification;

/**
 * Created by Administrator on 2015/7/7.
 */
public class SalariedPaymentClassifcation implements PaymentClassification {
    private final double salary;

    public SalariedPaymentClassifcation(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
