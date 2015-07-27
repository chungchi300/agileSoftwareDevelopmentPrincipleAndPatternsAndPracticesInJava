package com;

import com.employee.payment.method.HoldMethod;
import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.method.PaymentMethod;
import com.employee.payment.schedule.PaymentSchedule;

/**
 * Created by Administrator on 2015/7/7.
 */
public class Employee {
    private final String address;
    private PaymentClassification paymentClassification;
    private double salary;
    private PaymentSchedule paymentSchedule;
    private PaymentMethod paymentMethod;
    private String name;
    private int id;

    public Employee(int id, String name, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public PaymentClassification getPaymentClassification(){
        return  this.paymentClassification;
    }

    public double getSalary() {
        return salary;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentClassification(PaymentClassification paymentClassification) {
        this.paymentClassification = paymentClassification;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public void setPaymentMethod(HoldMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
