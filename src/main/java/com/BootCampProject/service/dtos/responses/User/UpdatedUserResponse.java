package com.BootCampProject.service.dtos.responses.User;

public class UpdatedUserResponse {
    private int id;
    private String username;
    private String firstName;

    public UpdatedUserResponse() {

    }
    public UpdatedUserResponse(String username, String firstName) {
        this.username = username;
        this.firstName = firstName;
    }
    public String getUsername() {
        return username;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
