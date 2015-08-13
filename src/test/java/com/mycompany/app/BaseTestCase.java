package com.mycompany.app;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2015/7/7.
 */
public class BaseTestCase extends TestCase {
    int empId = 1;
    double hourlyRate = 50;
    String name = "jeff";
    String address = "Hong Kong";
    double salary = 1000;
    double commissionRate = 0.05;
    public void testTrue(){
        this.assertTrue(true);
    }

}
