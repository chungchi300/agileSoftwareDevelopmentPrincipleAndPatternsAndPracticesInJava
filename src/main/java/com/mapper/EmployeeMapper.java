package com.mapper;

import com.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/7/21.
 */
public class EmployeeMapper {
    List<Employee> mockEmpployees = new ArrayList<Employee>();
    public  Employee selectByPrimaryKey(int empId) {
        return this.mockEmpployees.get(empId);
    }
}
