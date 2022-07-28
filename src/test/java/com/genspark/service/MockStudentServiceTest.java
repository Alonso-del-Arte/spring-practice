package com.genspark.service;

import com.genspark.entity.Student;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MockStudentServiceTest {

    private static final Random RANDOM = new Random();

    @Test
    void testGetAllStudentsDoesNotLeakReference() {
        StudentService mock = new MockStudentService();
        List<Student> firstList = mock.getAllStudents();
        firstList.add(new Student());
        List<Student> secondList = mock.getAllStudents();
        assertNotEquals(firstList, secondList);
    }

    @Test
    void testGetAllStudents() {
        System.out.println("getAllStudents");
        int expected = RANDOM.nextInt(128) + 32;
        StudentService mock = new MockStudentService();
        for (int i = 0; i < expected; i++) {
            Student student = new Student();
            student.setId(i);
            mock.addStudent(student);
        }
        int actual = mock.getAllStudents().size();
        String msg = "After adding " + expected
                + " students to mock service, mock should report that number";
        assertEquals(expected, actual, msg);
    }















}
