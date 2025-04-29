package com.BootCampProject.service.dtos.requests.Instructor;

public class UpdateInstructorRequest {

    private String username;
    private String password;
    private String email;
    private String companyName;


    public UpdateInstructorRequest() {
    }


    public UpdateInstructorRequest(String username, String companyName, String password, String email) {
        this.username = username;
        this.companyName = companyName;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
