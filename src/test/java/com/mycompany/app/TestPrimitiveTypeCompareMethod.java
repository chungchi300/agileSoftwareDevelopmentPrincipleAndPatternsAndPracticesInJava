package com.mycompany.app;

/**
 * Created by Administrator on 2015/7/7.
Presenter
 */

public class TestPrimitiveTypeCompareMethod extends BaseTestCase {
    public void testString(){
        String str1 = new String("abc");
        String str2 = new String("abc");

        assertTrue(str1.equals(str2));
    }
    public void testLong(){
        Long zero1 = new Long(0);
        Long zero2 = new Long(0);
        assertTrue(zero1.equals(zero2));
    }
    public void testLongStringNotEqualsToLong(){
        String str = new String("0");
        Long zero = new Long(0);
        assertFalse(str.equals(0));
    }
}
