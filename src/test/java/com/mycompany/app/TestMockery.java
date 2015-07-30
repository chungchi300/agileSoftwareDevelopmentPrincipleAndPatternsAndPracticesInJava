package com.mycompany.app;

import com.learning.mock.Counter;
import com.learning.mock.Order;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
/**
 * Created by Administrator on 2015/7/30.
 */

//to enable independency of component
public class TestMockery extends BaseTestCase{

    public void testCheckoutAnOrderSettingBehavior(){

        //which should call the set order object state to checkouted

        Order order = mock(Order.class);
        Mockito.when(order.setOrderState("checkouted")).thenReturn(true);
        Counter.getInstance().checkOutAnOrder(order);
        verify(order).setOrderState("checkouted");
    }
}
