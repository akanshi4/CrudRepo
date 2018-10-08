package com.example.learningJPA.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {

    @Id
    private int id;

    private String firstName;

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}