package com.mycompany.app;

import com.learning.varargs.ReportGenerator;
import com.learning.varargs.Student;

/**
 * Created by Administrator on 2015/7/7.
 */
public class TestReportGenerator extends BaseTestCase {
    public void testAddZero() {
        ReportGenerator reportGenerator = getANewReportGenerator();
        assertEquals(0, reportGenerator.getStudents().size());
    }
    public ReportGenerator getANewReportGenerator(){
        return new ReportGenerator();
    }
    public void testAddOneStudent() {
        ReportGenerator reportGenerator = getANewReportGenerator();
        reportGenerator.addStudents(new Student());
        assertEquals(1,reportGenerator.getStudents().size());
    }
    public void testAddTwoStudent() {
        ReportGenerator reportGenerator = getANewReportGenerator();
        reportGenerator.addStudents(new Student(),new Student());
        assertEquals(2,reportGenerator.getStudents().size());
    }

}
