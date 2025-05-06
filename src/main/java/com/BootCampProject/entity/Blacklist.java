package com.BootCampProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "blackLists")
public class Blacklist {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "reason")
    private String reason;

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "applicantId")
    private Applicant applicant;


    public Blacklist() {}

    public Blacklist(int id, String reason, LocalDate date, Applicant applicant) {
        this.id = id;
        this.reason = reason;
        this.date = date;
        this.applicant = applicant;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
