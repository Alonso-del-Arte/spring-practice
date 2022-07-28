package com.genspark.service;

import com.genspark.dao.StudentDAO;
import com.genspark.entity.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        return this.studentDAO.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> option = this.studentDAO.findById(id);
        return option.orElse(null);
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentDAO.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentDAO.save(student);
    }

    @Override
    public Student deleteStudentById(int id) {
        Optional<Student> option = this.studentDAO.findById(id);
        return option.orElse(null);
    }

}
