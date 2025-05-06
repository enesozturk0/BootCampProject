package com.BootCampProject.entity;

import com.BootCampProject.entity.enums.ApplicationState;
import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "applicantId")
    private Applicant applicantId;

    @ManyToOne
    @JoinColumn(name = "bootcampId")
    private BootCamp bootcampId;

    @Column(name = "applicationState")
    @Enumerated(EnumType.STRING)
    private ApplicationState applicationState;

    public Application() {}

    public Application(int id, Applicant applicantId, BootCamp bootcampId, ApplicationState applicationState) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootcampId = bootcampId;
        this.applicationState = applicationState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Applicant getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Applicant applicantId) {
        this.applicantId = applicantId;
    }

    public BootCamp getBootcampId() {
        return bootcampId;
    }

    public void setBootcampId(BootCamp bootcampId) {
        this.bootcampId = bootcampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
