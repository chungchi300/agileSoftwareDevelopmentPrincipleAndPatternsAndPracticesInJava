package com.mycompany.app;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.sort;

/**
 * Created by aigens on 27/8/2015.
 */
public class TestClosure extends  BaseTestCase{
    public void testClosure(){

        List<Integer> numbers = asList(3, 2, 6, 4);
        sort(numbers, (n1, n2) -> -n1.compareTo(n2));
        ll(numbers);
    }
    public void testAnonymousClass(){
        List<Integer> numbers = asList(3, 2, 6, 4);
        //comparator is an anonymous object implement the comparator interface,
        Comparator<Integer> descending = new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                return -n1.compareTo(n2);
            }
        };
        sort(numbers, descending);
        ll(numbers);

    }
}
