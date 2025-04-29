package com.BootCampProject.service.concretes;

import com.BootCampProject.entity.Applicant;
import com.BootCampProject.repository.ApplicantRepository;
import org.springframework.stereotype.Service;
import com.BootCampProject.service.abstracts.ApplicantService;
import com.BootCampProject.service.dtos.requests.Applicant.CreateApplicantRequest;
import com.BootCampProject.service.dtos.requests.Applicant.UpdateApplicantRequest;
import com.BootCampProject.service.dtos.responses.Applicant.CreatedApplicantResponse;
import com.BootCampProject.service.dtos.responses.Applicant.UpdatedApplicantResponse;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private final ApplicantRepository applicantRepository;

    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }
    @Override
    public CreatedApplicantResponse createApplicant(CreateApplicantRequest createApplicantRequest) {

        Applicant applicant = new Applicant();

        applicant.setUsername(createApplicantRequest.getUsername());
        applicant.setPassword(createApplicantRequest.getPassword());
        applicant.setEmail(createApplicantRequest.getEmail());
        applicant.setAbout(createApplicantRequest.getAbout());

        Applicant savedApplicant = applicantRepository.save(applicant);

        CreatedApplicantResponse createdApplicantResponse  = new CreatedApplicantResponse();
        createdApplicantResponse.setUsername(savedApplicant.getUsername());
        createdApplicantResponse.setAbout(savedApplicant.getAbout());

        return createdApplicantResponse;

    }

    @Override
    public UpdatedApplicantResponse updateApplicant(UpdateApplicantRequest updateApplicantRequest) {
        Applicant applicant = applicantRepository.findById(updateApplicantRequest.getId())
                .orElseThrow(() -> new RuntimeException("Applicant not found"));

        applicant.setUsername(updateApplicantRequest.getUsername());
        applicant.setPassword(updateApplicantRequest.getPassword());
        applicant.setEmail(updateApplicantRequest.getEmail());
        applicant.setAbout(updateApplicantRequest.getAbout());

        Applicant updatedApplicant = applicantRepository.save(applicant);

        UpdatedApplicantResponse updatedApplicantResponse = new UpdatedApplicantResponse();
        updatedApplicantResponse.setUsername(updatedApplicant.getUsername());
        updatedApplicantResponse.setAbout(updatedApplicant.getAbout());

        return updatedApplicantResponse;
    }
}
