package com.BootCampProject.service.dtos.responses.Applicant;

public class UpdatedApplicantResponse {
    private String username;
    private String about;

    public UpdatedApplicantResponse() {

    }
    public UpdatedApplicantResponse(String username, String about) {
        this.username = username;
        this.about = about;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }

}
