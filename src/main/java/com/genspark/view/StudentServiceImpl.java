package com.genspark.view;

import com.genspark.model.Student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        return this.studentDAO.findAll();
    }

    public Student getStudentById(int id) {
        Optional<Student> option = this.studentDAO.findById(id);
        return option.orElse(null);
    }

    public Student addStudent(Student student) {
        return this.studentDAO.save(student);
    }

    public Student updateStudent(Student student) {
        return this.studentDAO.save(student);
    }

    // TODO: Write tests for this
    public boolean deleteStudentById(int id) {
        Optional<Student> option = this.studentDAO.findById(id);
        return true;
    }

}
