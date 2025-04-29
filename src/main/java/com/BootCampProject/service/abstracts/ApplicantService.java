package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.Applicant.CreateApplicantRequest;
import com.BootCampProject.service.dtos.requests.Applicant.UpdateApplicantRequest;
import com.BootCampProject.service.dtos.responses.Applicant.CreatedApplicantResponse;
import com.BootCampProject.service.dtos.responses.Applicant.UpdatedApplicantResponse;

public interface ApplicantService {

    CreatedApplicantResponse createApplicant(CreateApplicantRequest createApplicantRequest);
    UpdatedApplicantResponse updateApplicant(UpdateApplicantRequest updateApplicantRequest);

}
