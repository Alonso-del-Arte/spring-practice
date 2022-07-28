package com.genspark.controller;

import com.genspark.model.Student;
import com.genspark.view.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    // TODO: Write tests for this
    @GetMapping("/")
    public String homePage() {
        return "NOT IMPLEMENTED YET";
    }

    // TODO: Write tests for this
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // TODO: Write tests for this
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable String studentId) {
        return this.studentService.getStudentById(Integer.parseInt(studentId));
    }

    // TODO: Write tests for this
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }

    // TODO: Write tests for this
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        return this.studentService.updateStudent(student);
    }

    // TODO: Write tests for this
    @DeleteMapping("/students/{studentId}")
    public String deleteByStudentId(@PathVariable String studentId) {
        return "NOT IMPLEMENTED YET";
        // this.studentService.deleteStudentById(Integer.parseInt(studentId));
    }

}
