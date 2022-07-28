package com.genspark.view;

import com.genspark.model.Student;

import java.util.List;

public interface StudentService {

    /**
     * Retrieves a list of all the students.
     * @return A list of all the students' records.
     */
    List<Student> getAllStudents();

    /**
     * Retrieves a list of the student with the specified ID number.
     * @param id The ID number of the specified student.
     * @return The record of the student with the matching ID.
     */
    Student getStudentById(int id);

    /**
     * Adds a record for the student.
     * @param student The record for the student.
     * @return The same record that was sent in, but with the proper ID filled
     * in maybe?
     */
    Student addStudent(Student student);

    /**
     * Updates a record for the student.
     * @param student The record for the student.
     * @return The same record that was sent in? Not exactly sure what the point
     * of this is...
     */
    Student updateStudent(Student student);

    /**
     * Deletes a student's record.
     * @param id The ID number of the specified student.
     * @return The student's record that was removed. Null if no record was
     * removed?
     */
    Student deleteStudentById(int id);

}
