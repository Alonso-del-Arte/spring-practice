package com.genspark.service;

import com.genspark.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockStudentService implements StudentService {

    private final Map<Integer, Student> students = new HashMap<>();

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(this.students.values());
    }

    // TODO: Write tests for what result should be when id not found
    @Override
    public Student getStudentById(int id) {
        return this.students.getOrDefault(id, new Student());
    }

    @Override
    public Student addStudent(Student student) {
        int id = this.students.size() + 1;
        student.setId(id);
        this.students.put(id, student);
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
