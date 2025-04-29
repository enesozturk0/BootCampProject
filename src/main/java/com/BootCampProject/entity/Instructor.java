package com.BootCampProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "instructors")
public class Instructor extends User{

    @Column(name = "companyname")
    private String companyName;

    public Instructor(){}

    public Instructor(int id, String username, String firstName, String lastName, LocalDate dateOfBirth, String nationalIdentity, String email, String password, String companyName) {
        super(id, username, firstName, lastName, dateOfBirth, nationalIdentity, email, password);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
