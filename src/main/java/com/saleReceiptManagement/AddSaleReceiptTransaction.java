package com.saleReceiptManagement;

import com.employeeManagement.TransactionCommand;

import java.util.Date;

/**
 * Created by Administrator on 2015/8/7.
 */
public class AddSaleReceiptTransaction implements TransactionCommand {

    private final int empId;
    private final Date date;
    private final double amount;

    public AddSaleReceiptTransaction(int empId, Date date, double amount) {
        this.empId = empId;
        this.date = date;
        this.amount = amount;
    }

    public void execute() {

    }
}
