package com.timeCardManagement;

import com.Employee;
import com.TimeCard;
import com.database.PayrollDatabase;
import com.employee.payment.classification.HourlyPaymentClassifcation;
import com.employeeManagement.TransactionCommand;

import java.util.Date;

/**
 * Created by Administrator on 2015/8/7.
 */
public class AddTimeCardTransaction implements TransactionCommand {
    private  Date date;
    private  int hour;
    private  int empId;

    public AddTimeCardTransaction(Date date, int hour, int empId) {
        this.date = date;
        this.hour = hour;
        this.empId = empId;
    }

    public void execute() {
        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);
        HourlyPaymentClassifcation pc = (HourlyPaymentClassifcation) employee.getPaymentClassification();
        TimeCard timeCard = new TimeCard();
        timeCard.setDate(date);
        timeCard.setHour(hour);

        pc.addTimeCard(timeCard);
    }
}
