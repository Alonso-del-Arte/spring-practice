package com.genspark.view;

import com.genspark.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MockStudentService implements StudentService {

    private final List<Student> students = new ArrayList<>();

    // TODO: Write tests for this
    @Override
    public List<Student> getAllStudents() {
        return this.students;
    }

    // TODO: Write tests for this
    @Override
    public Student getStudentById(int id) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Student addStudent(Student student) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Student deleteStudentById(int id) {
        return null;
    }

}
