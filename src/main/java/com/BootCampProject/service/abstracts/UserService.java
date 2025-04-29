package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.User.CreateUserRequest;
import com.BootCampProject.service.dtos.requests.User.UpdateUserRequest;
import com.BootCampProject.service.dtos.responses.User.CreatedUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetListUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetUserResponse;
import com.BootCampProject.service.dtos.responses.User.UpdatedUserResponse;

import java.util.List;

public interface UserService {

    CreatedUserResponse createUser(CreateUserRequest createUserRequest);
    UpdatedUserResponse updateUser(UpdateUserRequest updateUserRequest);
    List<GetListUserResponse> getAllUsers();
    void delete(int id);
    GetUserResponse getUserByName(String name);
}
