package com.mycompany.app;

import com.Employee;
import com.database.PayrollDatabase;
import com.employee.payment.classification.HourlyPaymentClassifcation;
import com.employee.payment.classification.PaymentClassification;
import com.employee.payment.classification.SalariedAndCommissionedPaymentClassifcation;
import com.employee.payment.classification.SalariedPaymentClassifcation;
import com.employee.payment.method.HoldMethod;
import com.employee.payment.method.PaymentMethod;
import com.employee.payment.schedule.BiweeklyPaymentSchedule;
import com.employee.payment.schedule.MonthlyPaymentSchedule;
import com.employee.payment.schedule.PaymentSchedule;
import com.employee.payment.schedule.WeeklyPaymentSchedule;
import com.employeeManagement.add.AddHourlyEmployeeTransaction;
import com.employeeManagement.add.AddSalariedAndCommissionedEmployeeTransaction;
import com.employeeManagement.add.AddSalariedEmployeeTransaction;

/**
 * Created by Administrator on 2015/7/7.
 */
public class TestAddEmployee extends BaseTestCase {

    public void testAddHourlyEmployee(){

        AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(empId,name,address,hourlyRate);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);
        PaymentClassification pc = employee.getPaymentClassification();
        assertEquals(HourlyPaymentClassifcation.class, pc.getClass());
        HourlyPaymentClassifcation hc = (HourlyPaymentClassifcation)pc;
        assertEquals(hc.getHourlyRate(), hourlyRate);
        PaymentSchedule s = employee.getPaymentSchedule();
        assertEquals(WeeklyPaymentSchedule.class, s.getClass());
        PaymentMethod paymentMethod = employee.getPaymentMethod();
        assertEquals(HoldMethod.class, paymentMethod.getClass());


    }
    public void testAddSalariedAndCommissionedEmployee(){
        AddSalariedAndCommissionedEmployeeTransaction t = new AddSalariedAndCommissionedEmployeeTransaction(empId,name,address,salary,commissionRate);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);
        PaymentClassification pc = employee.getPaymentClassification();
        assertEquals(SalariedAndCommissionedPaymentClassifcation.class, pc.getClass());
        SalariedAndCommissionedPaymentClassifcation sc = (SalariedAndCommissionedPaymentClassifcation)pc;
        assertEquals(sc.getSalary(), salary);
        assertEquals(sc.getCommissionRate(),commissionRate);
        PaymentSchedule s = employee.getPaymentSchedule();
        assertEquals(BiweeklyPaymentSchedule.class, s.getClass());
        PaymentMethod paymentMethod = employee.getPaymentMethod();
        assertEquals(HoldMethod.class, paymentMethod.getClass());

    }
    public void testAddSalariedEmployee() {

        AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(empId, name, address, salary);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(empId);
        PaymentClassification pc = employee.getPaymentClassification();
        assertEquals(SalariedPaymentClassifcation.class, pc.getClass());
        SalariedPaymentClassifcation sc = (SalariedPaymentClassifcation)pc;
        assertEquals(sc.getSalary(),salary);
        PaymentSchedule s = employee.getPaymentSchedule();
        assertEquals(MonthlyPaymentSchedule.class, s.getClass());
        PaymentMethod paymentMethod = employee.getPaymentMethod();
        assertEquals(HoldMethod.class, paymentMethod.getClass());
    }
    public void testDeleteEmployee(){
        AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(empId, name, address, salary);
        t.execute();
        assertEquals(1, PayrollDatabase.getInstance().allEmployee().size());
        PayrollDatabase.getInstance().deleteEmployee(empId);
        assertEquals(0, PayrollDatabase.getInstance().allEmployee().size());
    }

}
