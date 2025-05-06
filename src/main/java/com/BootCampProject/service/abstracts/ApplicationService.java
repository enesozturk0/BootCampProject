package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.Application.CreateApplicationRequest;
import com.BootCampProject.service.dtos.requests.Application.UpdateApplicationRequest;
import com.BootCampProject.service.dtos.responses.Application.CreateApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetByIdApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetListApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.UpdateApplicationResponse;

import java.util.List;

public interface ApplicationService {
    CreateApplicationResponse add(CreateApplicationRequest request);
    UpdateApplicationResponse update(UpdateApplicationRequest request);
    void deleteApplication(int id);

    GetByIdApplicationResponse getById(int id);
    List<GetListApplicationResponse> getAll();
    List<GetListApplicationResponse> getByApplicantId(int applicantId);
}



