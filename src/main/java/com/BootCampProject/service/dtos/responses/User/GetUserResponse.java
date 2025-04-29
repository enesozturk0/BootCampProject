package com.BootCampProject.service.dtos.responses.User;

public class GetUserResponse {
    private int id;
    private String username;
    private String firstName;

    public GetUserResponse() {

    }
    public GetUserResponse(String username, String firstName,int id) {
        this.username = username;
        this.firstName = firstName;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
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
