package com.BootCampProject.service.dtos.responses.User;

public class CreatedUserResponse {
    private int id;
    private String username;
    private String firstName;

    public CreatedUserResponse() {

    }

    public CreatedUserResponse(String username, String firstName, int id) {
        this.username = username;
        this.firstName = firstName;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

}
