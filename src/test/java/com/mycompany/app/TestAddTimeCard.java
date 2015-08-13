package com.mycompany.app;

import com.Employee;
import com.SaleReceipt;
import com.TimeCard;
import com.database.PayrollDatabase;
import com.employee.payment.classification.HourlyPaymentClassifcation;
import com.employee.payment.classification.SalariedAndCommissionedPaymentClassifcation;
import com.employeeManagement.add.AddHourlyEmployeeTransaction;
import com.employeeManagement.add.AddSalariedAndCommissionedEmployeeTransaction;
import com.saleReceiptManagement.AddSaleReceiptTransaction;
import com.timeCardManagement.AddTimeCardTransaction;

import java.util.Date;

/**
 * Created by Administrator on 2015/7/7.
 */
public class TestAddTimeCard extends BaseTestCase {

    public void testAddTimeCard() {
        //build

        AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(empId,name,address,hourlyRate);
        t.execute();
        //execute
        int hour = 6;
        Date date = new Date();
        AddTimeCardTransaction addTimeCardTransaction = new AddTimeCardTransaction(date,hour, empId);
        addTimeCardTransaction.execute();


        //check
        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);

        HourlyPaymentClassifcation hourlyPaymentClassifcation = (HourlyPaymentClassifcation)employee.getPaymentClassification();
        TimeCard timecard = hourlyPaymentClassifcation.getTimeCard((int) date.getTime());

        assertEquals(6,timecard.getHour());
        assertEquals(date.getTime(),timecard.getDate().getTime());

    }
    public void testAddSaleReceipt(){
        //build
        Date date = new Date();
        double amount = 1000;
        AddSalariedAndCommissionedEmployeeTransaction t = new AddSalariedAndCommissionedEmployeeTransaction(empId,name,address,salary,commissionRate);
        t.execute();
        //execute
        AddSaleReceiptTransaction addSaleReceiptTransaction = new AddSaleReceiptTransaction(empId,date,amount);
        addSaleReceiptTransaction.execute();
        //check
        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);
        SalariedAndCommissionedPaymentClassifcation salariedAndCommissionedPaymentClassifcation =  (SalariedAndCommissionedPaymentClassifcation)employee.getPaymentClassification();
        SaleReceipt saleReceipt = salariedAndCommissionedPaymentClassifcation.getSaleReceipt(date.getTime());
        assertEquals(saleReceipt.getAmount(),saleReceipt.getAmount());
        assertEquals(date.getDate(),saleReceipt.getDate());

    }
}
