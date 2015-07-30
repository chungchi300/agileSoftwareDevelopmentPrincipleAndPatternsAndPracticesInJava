package com.learning.varargs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/7/29.
 */
public class ReportGenerator {

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    private List<Student> students = new ArrayList<Student>();
    public void addStudents(Student... students){
        for(Student student:students){
            this.students.add(student);
        }
    }
}
