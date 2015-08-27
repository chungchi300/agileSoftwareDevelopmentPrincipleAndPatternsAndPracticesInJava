package com.learning.composite;

/**
 * Created by aigens on 26/8/2015.
 */
public class TaskLeaf implements TaskComponent {
    public String getTaskDescription() {
        return "TaskLeaf description";
    }
}
