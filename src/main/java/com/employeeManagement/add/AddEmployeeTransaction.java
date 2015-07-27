package com.employeeManagement.add;

import com.Employee;
import com.database.PayrollDatabase;
import com.employee.payment.method.HoldMethod;
import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.schedule.PaymentSchedule;
import com.employeeManagement.TransactionCommand;

/**
 * Created by Administrator on 2015/7/7.
 */
public abstract class AddEmployeeTransaction implements TransactionCommand {
    private final int empId;
    private final String name;
    private final String address;

    public AddEmployeeTransaction(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;

    }

    public void execute() {
        Employee employee = new Employee(empId,name,address);
        PaymentClassification paymentClassification = getPaymentClassification();
        employee.setPaymentClassification(paymentClassification);
        PaymentSchedule paymentSchedule = getPaymentSchedule();
        employee.setPaymentSchedule(paymentSchedule);
        employee.setPaymentMethod(new HoldMethod());
        PayrollDatabase.getInstance().createEmployee(employee);

    }
    public abstract PaymentClassification getPaymentClassification();

    public abstract  PaymentSchedule getPaymentSchedule() ;

 }
