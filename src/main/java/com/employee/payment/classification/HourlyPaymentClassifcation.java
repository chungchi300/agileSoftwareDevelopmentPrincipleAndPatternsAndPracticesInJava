package com.employee.payment.classification;

/**
 * Created by Administrator on 2015/7/7.
 */
public class HourlyPaymentClassifcation implements PaymentClassification {

    private final double hourlyRate;

    public HourlyPaymentClassifcation(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
