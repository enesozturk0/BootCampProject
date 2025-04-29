package com.BootCampProject.service.dtos.responses.User;

public class DeletedBrandResponse {
    private int id;

    public DeletedBrandResponse(){

    }
    public DeletedBrandResponse(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
