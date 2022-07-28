package com.genspark.view;

import com.genspark.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MockStudentServiceTest {

    @Test
    void testGetAllStudentsDoesNotLeakReference() {
        StudentService mock = new MockStudentService();
        List<Student> firstList = mock.getAllStudents();
        firstList.add(new Student());
        List<Student> secondList = mock.getAllStudents();
        assertNotEquals(firstList, secondList);
    }

}
