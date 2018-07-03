package com.twimi.rainbow.Dao;

import com.twimi.rainbow.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("14080026","Ivan"));
        return students;
    }

    public boolean login(String username,String password){
        if("ivan".equals(username) && "123".equals(password)){
            return true;
        }else {
            return false;
        }
    }
}
