package com.BootCampProject.service.dtos.responses.Instructor;

public class CreatedInstructorResponse {

    private String username;
    private String companyName;

    public CreatedInstructorResponse() {

    }
    public CreatedInstructorResponse(String username, String companyName) {
        this.username = username;
        this.companyName = companyName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
