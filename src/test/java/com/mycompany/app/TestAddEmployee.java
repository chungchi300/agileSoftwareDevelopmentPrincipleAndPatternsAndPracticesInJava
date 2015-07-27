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
    int id = 1;
    String name = "jeff";
    String address = "Hong Kong";
    public void testMyBatis() {
//        PayrollDatabase.getInstance().findOrFailBlog(101);
        PayrollDatabase.getInstance().insertAStudent();
    }
    public void testAddHourlyEmployee(){
        double hourlyRate = 50;
        AddHourlyEmployeeTransaction t = new AddHourlyEmployeeTransaction(id,name,address,hourlyRate);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(id);
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
        AddSalariedAndCommissionedEmployeeTransaction t = new AddSalariedAndCommissionedEmployeeTransaction(id,name,address,1000,0.5);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(id);
        PaymentClassification pc = employee.getPaymentClassification();
        assertEquals(SalariedAndCommissionedPaymentClassifcation.class, pc.getClass());
        SalariedAndCommissionedPaymentClassifcation sc = (SalariedAndCommissionedPaymentClassifcation)pc;
        assertEquals(sc.getSalary(), 1000.0);
        assertEquals(sc.getCommissionRate(),0.5);
        PaymentSchedule s = employee.getPaymentSchedule();
        assertEquals(BiweeklyPaymentSchedule.class, s.getClass());
        PaymentMethod paymentMethod = employee.getPaymentMethod();
        assertEquals(HoldMethod.class, paymentMethod.getClass());

    }
    public void testAddSalariedEmployee() {

        AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(id, name, address, 1000);
        t.execute();

        Employee employee = PayrollDatabase.getInstance().findOrFailEmployee(id);
        PaymentClassification pc = employee.getPaymentClassification();
        assertEquals(SalariedPaymentClassifcation.class, pc.getClass());
        SalariedPaymentClassifcation sc = (SalariedPaymentClassifcation)pc;
        assertEquals(sc.getSalary(), 1000.0);
        PaymentSchedule s = employee.getPaymentSchedule();
        assertEquals(MonthlyPaymentSchedule.class, s.getClass());
        PaymentMethod paymentMethod = employee.getPaymentMethod();
        assertEquals(HoldMethod.class, paymentMethod.getClass());
    }
    public void testDeleteEmployee(){
        AddSalariedEmployeeTransaction t = new AddSalariedEmployeeTransaction(id, name, address, 1000);
        t.execute();
        assertEquals(1, PayrollDatabase.getInstance().allEmployee().size());
        PayrollDatabase.getInstance().deleteEmployee(id);
        assertEquals(0, PayrollDatabase.getInstance().allEmployee().size());
    }


}
