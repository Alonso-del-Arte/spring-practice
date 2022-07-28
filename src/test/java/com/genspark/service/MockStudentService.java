package com.genspark.service;

import com.genspark.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class MockStudentService implements StudentService {

    private final List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(this.students);
    }

    // TODO: Write tests for this
    @Override
    public Student getStudentById(int id) {
        return null;
    }

    // TODO: Write tests for this
    @Override
    public Student addStudent(Student student) {
        this.students.add(student);
        return student;
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
