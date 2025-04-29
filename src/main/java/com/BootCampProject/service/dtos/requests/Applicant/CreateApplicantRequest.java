package com.BootCampProject.service.dtos.requests.Applicant;

public class CreateApplicantRequest  {

    private int id;
    private String username;
    private String password;
    private String email;
    private String about;

    public CreateApplicantRequest() {}

    public CreateApplicantRequest(String username, String password, String email, String about,int id) {
        this.username = username;
        this.password = password;
        this.email = email;
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
