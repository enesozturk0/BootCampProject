package com.BootCampProject.service.abstracts;

import com.BootCampProject.entity.enums.BootcampState;
import com.BootCampProject.service.dtos.requests.Bootcamp.CreateBootcampRequest;
import com.BootCampProject.service.dtos.requests.Bootcamp.UpdateBootcampRequest;
import com.BootCampProject.service.dtos.responses.Bootcamp.CreateBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetByIdBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetListBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.UpdateBootcampResponse;

import java.util.List;

public interface BootcampService {
    CreateBootcampResponse add(CreateBootcampRequest request);
    UpdateBootcampResponse update(UpdateBootcampRequest request);
    void delete(int id);

    GetByIdBootcampResponse getById(int id);
    List<GetListBootcampResponse> getAll();
    List<GetListBootcampResponse> getByState(BootcampState state);
}
