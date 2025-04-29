package com.BootCampProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee extends User {
    @Column(name = "position")
    private String position;

    public Employee(){}

    public Employee(int id, String username, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity, String email, String password, String position) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.position = position;
    }

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
