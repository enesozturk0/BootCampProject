package com.BootCampProject.service.dtos.requests.Applicant;

public class UpdateApplicantRequest {

    private int id;
    private String username;
    private String password;
    private String email;
    private String about;

    public UpdateApplicantRequest() {

    }

    public UpdateApplicantRequest(String username, String email, String password, String about, int id) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.about = about;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
