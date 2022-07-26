package com.genspark.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;

    private String name;

    @Autowired
    private List<Phone> phones;

    @Autowired
    private Address address;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("name must not be null");
        }
        this.name = name;
    }

    public List<Phone> getPhones() {
        return new ArrayList<>(this.phones);
    }

    public void setPhones(List<Phone> phones) {
        if (phones == null) {
            throw new NullPointerException("Phones list must not be null");
        }
        this.phones = phones;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
