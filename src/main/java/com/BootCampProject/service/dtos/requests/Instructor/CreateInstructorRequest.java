package com.BootCampProject.service.dtos.requests.Instructor;

public class CreateInstructorRequest {

    private String username;
    private String password;
    private String email;
    private String companyName;


    public CreateInstructorRequest() {
    }

    public CreateInstructorRequest(String username, String email, String password, String companyName) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
