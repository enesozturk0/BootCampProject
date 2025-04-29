package com.BootCampProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.BootCampProject.service.abstracts.UserService;
import com.BootCampProject.service.dtos.requests.User.CreateUserRequest;
import com.BootCampProject.service.dtos.requests.User.UpdateUserRequest;
import com.BootCampProject.service.dtos.responses.User.CreatedUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetListUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetUserResponse;
import com.BootCampProject.service.dtos.responses.User.UpdatedUserResponse;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListUserResponse> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public GetUserResponse getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedUserResponse createUser(@RequestBody CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable int id){
        userService.delete(id);

    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UpdatedUserResponse updateUser(@PathVariable int id, @RequestBody UpdateUserRequest updateUserRequest){
        return userService.updateUser(updateUserRequest);

    }


}
