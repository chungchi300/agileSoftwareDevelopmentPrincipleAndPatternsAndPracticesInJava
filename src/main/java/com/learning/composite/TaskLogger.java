package com.learning.composite;

/**
 * Created by aigens on 26/8/2015.
 */
public class TaskLogger {
    public static String logActivity(TaskComponent activity){
        return activity.getTaskDescription();
    }
}
