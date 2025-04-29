package com.BootCampProject.service.dtos.requests.Employee;

public class UpdateEmployeeRequest {
    private String username;
    private String password;
    private String email;
    private String position;

    public UpdateEmployeeRequest() {
    }
    public UpdateEmployeeRequest(String username, String email, String password, String position) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.position = position;
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
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

}
