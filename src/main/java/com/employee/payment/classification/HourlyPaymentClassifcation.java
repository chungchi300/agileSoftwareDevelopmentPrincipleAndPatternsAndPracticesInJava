package com.employee.payment.classification;

import com.TimeCard;
import com.database.PayrollDatabase;

import java.util.List;

/**
 * Created by Administrator on 2015/7/7.
 */
public class HourlyPaymentClassifcation implements PaymentClassification {

    private final double hourlyRate;
    private List<TimeCard> timeCards;

    public HourlyPaymentClassifcation(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public List<TimeCard> getTimeCards() {
        return timeCards;
    }

    public void addTimeCard(TimeCard timeCard) {
        PayrollDatabase.getInstance().createTimeCard(timeCard);
    }
    public TimeCard getTimeCard(int time){
        return PayrollDatabase.getInstance().findOrFailTimeCard(time);
    }
}
