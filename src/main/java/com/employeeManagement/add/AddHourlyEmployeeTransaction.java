package com.employeeManagement.add;

import com.employee.payment.classification.HourlyPaymentClassifcation;
import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.schedule.PaymentSchedule;
import com.employee.payment.schedule.WeeklyPaymentSchedule;

/**
 * Created by Administrator on 2015/7/21.
 */
public class AddHourlyEmployeeTransaction extends AddEmployeeTransaction {
    private final double hourlyRate;

    public AddHourlyEmployeeTransaction(int id, String name, String address, double hourlyRate) {
        super(id,name,address);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getPaymentClassification() {
        return new HourlyPaymentClassifcation(this.hourlyRate);
    }

    @Override
    public PaymentSchedule getPaymentSchedule() {
        return new WeeklyPaymentSchedule();
    }
}
