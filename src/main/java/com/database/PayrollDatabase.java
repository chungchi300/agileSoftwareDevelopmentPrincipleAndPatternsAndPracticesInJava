package com.database;

import com.Employee;
import com.dto.Student;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/16.
 */
//Facade of com.database object
public class PayrollDatabase {
    private static PayrollDatabase ourInstance = new PayrollDatabase();
    private static SqlSession session;
    Map<Integer,Employee> mockEmpployees = new HashMap<Integer,Employee>();
    public void createEmployee(Employee employee){
         this.mockEmpployees.put(employee.getId(), employee);
    }
    public Employee findOrFailEmployee(int id){
        return this.mockEmpployees.get(id);
    }
    public static PayrollDatabase getInstance() throws RuntimeException {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            //true for auto commit model,false for event model
            session = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException();
        }

        return ourInstance;
    }

    private PayrollDatabase() {
    }
    public void findOrFailStudent(){
//        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//
//        Student student = studentMapper.selectByPrimaryKey(1);
    }

    public void insertAStudent(){

        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = new Student();

        student.setName(55);
        studentMapper.insert(student);
        session.close();
    }

    public Collection<Employee> allEmployee() {
        return mockEmpployees.values();
    }

    public void deleteEmployee(int id) {
        this.mockEmpployees.remove(id);
    }
}
