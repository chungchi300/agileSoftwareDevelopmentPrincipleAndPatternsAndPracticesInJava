package com.mycompany.app;

import com.learning.genericType.Box;
import com.learning.genericType.BoxWihtoutGenericType;

/**
 * Created by Administrator on 2015/7/7.
 */
public class TestGenericType extends BaseTestCase {
    public void testNormalCollection() {
        assertTrue(true);
    }
    public void testPutItemInBoxWithoutGeneric(){
        BoxWihtoutGenericType boxWihtoutGenericType = new BoxWihtoutGenericType();
        boxWihtoutGenericType.setItem("55");
        assertEquals(boxWihtoutGenericType.getItem(),"55");
    }
    public void testPutItemInBoxWithoutGenericForgotCase(){
        BoxWihtoutGenericType boxWihtoutGenericType = new BoxWihtoutGenericType();
        boxWihtoutGenericType.setItem(55);
        assertNotSame(String.class, boxWihtoutGenericType.getItem().getClass());
    }
    public void testPutItemInBox(){
        Box<String> box = new Box<String>();
        box.setGenericTypeSpecificObject("55");
        assertEquals(box.getGenericTypeSpecificObject(), "55");
    }
    public void testPutItemInBoxForgotCase(){
        Box<String> box = new Box<String>();
        //TODO see,it won't even passed the compile test case
        // box.setGenericTypeSpecificObject(55);
        //assertEquals(box.getGenericTypeSpecificObject(),"55");

    }
    public void testNotCreatingTwoClassInRunTimeButJustCompileTimeLimitation(){
        Box<String> box = new Box<String>();
        Box<Integer> boxI = new Box<Integer>();
        assertEquals(box.getClass(),boxI.getClass());
    }
}
