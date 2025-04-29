package com.BootCampProject.service.concretes;

import com.BootCampProject.entity.User;
import org.springframework.stereotype.Service;
import com.BootCampProject.repository.UserRepository;
import com.BootCampProject.service.abstracts.UserService;
import com.BootCampProject.service.dtos.requests.User.CreateUserRequest;
import com.BootCampProject.service.dtos.requests.User.UpdateUserRequest;
import com.BootCampProject.service.dtos.responses.User.CreatedUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetListUserResponse;
import com.BootCampProject.service.dtos.responses.User.GetUserResponse;
import com.BootCampProject.service.dtos.responses.User.UpdatedUserResponse;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public CreatedUserResponse createUser(CreateUserRequest createUserRequest) {

        User user = new User();

        user.setUsername(createUserRequest.getUsername());
        user.setFirstName(createUserRequest.getFirstName());
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        User createdUser = userRepository.save(user);

        CreatedUserResponse createdUserResponse = new CreatedUserResponse();
        createdUserResponse.setId(createdUser.getId());
        createdUserResponse.setUsername(createdUser.getUsername());
        createdUserResponse.setFirstName(createdUser.getFirstName());

        return createdUserResponse;


    }

    @Override
    public UpdatedUserResponse updateUser(UpdateUserRequest updateUserRequest) {

        User user = userRepository.
                findById(updateUserRequest.getId()).orElseThrow(()->new RuntimeException("User not found"));
        user.setUsername(updateUserRequest.getUsername());
        user.setEmail(updateUserRequest.getEmail());
        user.setPassword(updateUserRequest.getPassword());

        User updatedUser = userRepository.save(user);
        UpdatedUserResponse updatedUserResponse = new UpdatedUserResponse();
        updatedUserResponse.setId(updatedUser.getId());
        updatedUserResponse.setUsername(updatedUser.getUsername());
        return updatedUserResponse;


    }

    @Override
    public List<GetListUserResponse> getAllUsers() {

        List<User> users = userRepository.findAll();

        return users.stream().map(this::mapToGetListUserResponse).collect(Collectors.toList());


    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);

    }

    @Override
    public GetUserResponse getUserByName(String name) {
    User user = userRepository.getByFirstName(name);
    return mapToGetUserResponse(user);

    }

    private GetListUserResponse mapToGetListUserResponse(User user){
        GetListUserResponse getListResponse = new GetListUserResponse();
        getListResponse.setId(user.getId());
        getListResponse.setUsername(user.getUsername());
        getListResponse.setFirstName(user.getFirstName());
        return getListResponse;
    }

    private GetUserResponse mapToGetUserResponse(User user){
        GetUserResponse getUserResponse = new GetUserResponse();
        getUserResponse.setId(user.getId());
        getUserResponse.setUsername(user.getUsername());
        return getUserResponse;
    }

}
