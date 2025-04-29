package com.BootCampProject.controller;

import com.BootCampProject.service.abstracts.ApplicantService;
import com.BootCampProject.service.dtos.requests.Applicant.CreateApplicantRequest;
import com.BootCampProject.service.dtos.requests.Applicant.UpdateApplicantRequest;
import com.BootCampProject.service.dtos.responses.Applicant.CreatedApplicantResponse;
import com.BootCampProject.service.dtos.responses.Applicant.UpdatedApplicantResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applicants")
public class ApplicantController {


    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @PostMapping
    public ResponseEntity<CreatedApplicantResponse> createApplicant(@RequestBody CreateApplicantRequest createApplicantRequest) {
        CreatedApplicantResponse createdApplicantResponse = applicantService.createApplicant(createApplicantRequest);
        return new ResponseEntity<>(createdApplicantResponse, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<UpdatedApplicantResponse> updateApplicant(@RequestBody UpdateApplicantRequest updateApplicantRequest) {
        UpdatedApplicantResponse updatedApplicantResponse = applicantService.updateApplicant(updateApplicantRequest);
        return ResponseEntity.ok(updatedApplicantResponse);
    }

}
