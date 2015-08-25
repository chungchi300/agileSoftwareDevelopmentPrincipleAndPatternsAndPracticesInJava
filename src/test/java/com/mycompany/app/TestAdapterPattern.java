package com.mycompany.app;


import com.learning.adapter.JsonHttpAdapter;

/**
 * Created by aigens on 25/8/2015.
 */
public class TestAdapterPattern extends BaseTestCase {
    public void testMain(){
        JsonHttpAdapter jsonHttpAdapter = new JsonHttpAdapter();
        assertFalse(jsonHttpAdapter.hasEntity());

        jsonHttpAdapter.load("json content in value");
        assertTrue(jsonHttpAdapter.hasEntity());
    }
}
