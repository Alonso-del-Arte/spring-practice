package com.genspark.service;

import com.genspark.entity.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests of the MockStudentService class.
 * @author Alonso del Arte
 */
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

    @Test
    void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student();
        student.setId(Integer.MIN_VALUE);
        String name = "John Q. Test";
        student.setName(name);
        StudentService mock = new MockStudentService();
        mock.addStudent(student);
        List<Student> list = mock.getAllStudents();
        String msg = "After adding " + name
                + " to mock, student's name should be in mock";
        assert list.stream().anyMatch(s -> s.getName().equals(name)) : msg;
    }

    @Test
    void testAddStudentGivesUniqueIDNumbers() {
        int expected = RANDOM.nextInt(128) + 32;
        StudentService mock = new MockStudentService();
        for (int i = 0; i < expected; i++) {
            Student student = new Student();
            student.setId(Integer.MAX_VALUE);
            student.setName("Test Student " + i);
            mock.addStudent(student);
        }
        List<Student> students = mock.getAllStudents();
        Set<Integer> idNumbers = new HashSet<>(expected);
        for (Student student : students) {
            idNumbers.add(student.getId());
        }
        int actual = idNumbers.size();
        String msg = "Given " + expected
                + " students, there should be as many ID numbers";
        assertEquals(expected, actual, msg);
    }

    @Test
    void testGetStudentById() {
        System.out.println("getStudentById");
        int capacity = RANDOM.nextInt(128) + 32;
        StudentService mock = new MockStudentService();
        Map<Integer, Student> map = new HashMap<>(capacity);
        for (int i = 0; i < capacity; i++) {
            Student student = new Student();
            student.setName("Test Student " + i);
            Student addedStudent = mock.addStudent(student);
            map.put(addedStudent.getId(), addedStudent);
        }
        for (int id : map.keySet()) {
            Student expected = map.get(id);
            Student actual = mock.getStudentById(id);
            assertEquals(expected, actual);
        }
    }

}
