package com.mycompany.app;


import com.learning.composite.TaskComponent;
import com.learning.composite.TaskComposite;
import com.learning.composite.TaskLeaf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aigens on 25/8/2015.
 */
public class TestCompositePattern extends BaseTestCase {
    public void testMain(){
        TaskComposite taskComponent = new TaskComposite();
        TaskComponent taskComponent1 = new TaskComposite();
        TaskComponent taskComponent2 = new TaskLeaf();
        List<TaskComponent> taskComponentList = new ArrayList<TaskComponent>();
        taskComponentList.add(taskComponent1);
        taskComponentList.add(taskComponent2);
        taskComponent.setTaskComponents(taskComponentList);
        System.out.println(taskComponent.getTaskDescription());
    }
}
