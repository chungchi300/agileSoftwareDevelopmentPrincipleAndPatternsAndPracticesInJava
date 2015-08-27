package com.learning.composite;

import java.util.List;

/**
 * Created by aigens on 26/8/2015.
 */
public class TaskComposite implements TaskComponent {

    List<TaskComponent> taskComponents;
    public List<TaskComponent> getTaskComponents() {
        return taskComponents;
    }

    public void setTaskComponents(List<TaskComponent> taskComponents) {
        this.taskComponents = taskComponents;
    }

    public String getTaskDescription() {
        String description = "";
        if(taskComponents!=null){
            for(TaskComponent taskComponent:taskComponents){
                description = description + " => " + taskComponent.getTaskDescription();
            }

        }
        return "TaskComposite description"+description;
    }
}
