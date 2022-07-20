package com.genspark.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testSetNameRejectsNullName() {
        Student student = new Student();
        Throwable t = assertThrows(NullPointerException.class, () -> {
            student.setName(null);
            System.out.println("Should not have been able to set " + student
                    + "'s name to null");
        });
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        System.out.println("\"" + excMsg + "\"");
    }

    @Test
    void testGetPhonesDoesNotLeakPrivateReference() {
        Student student = new Student();
        student.setPhones(new ArrayList<>());
        List<Phone> phones = student.getPhones();
        Phone phone = new Phone();
        phone.setMobile("3135550109");
        phones.add(phone);
        String msg = "getPhones() should not leak phones list reference";
        assertNotEquals(student.getPhones(), phones, msg);
    }

    @Test
    void testSetPhonesRejectsNullPhoneList() {
        Student student = new Student();
        Throwable t = assertThrows(NullPointerException.class, () -> {
            student.setPhones(null);
            System.out.println("Should not have been able to set " + student
                    + "'s phones to null");
        });
        String excMsg = t.getMessage();
        assert excMsg != null : "Exception message should not be null";
        System.out.println("\"" + excMsg + "\"");
    }

}
