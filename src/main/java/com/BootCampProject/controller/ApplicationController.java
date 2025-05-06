package com.BootCampProject.controller;

import com.BootCampProject.service.abstracts.ApplicationService;
import com.BootCampProject.service.dtos.requests.Application.CreateApplicationRequest;
import com.BootCampProject.service.dtos.requests.Application.UpdateApplicationRequest;
import com.BootCampProject.service.dtos.responses.Application.CreateApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetByIdApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetListApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.UpdateApplicationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicationResponse> getAll() {
        return applicationService.getAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetByIdApplicationResponse getById(@PathVariable int id) {
        return applicationService.getById(id);
    }

    @GetMapping("applicant/{applicantId}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicationResponse> getByApplicantId(@PathVariable int applicantId) {
        return applicationService.getByApplicantId(applicantId);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdateApplicationResponse update(@RequestBody UpdateApplicationRequest request) {
        return applicationService.update(request);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateApplicationResponse add(@RequestBody CreateApplicationRequest request) {
        return applicationService.add(request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id) {
        applicationService.deleteApplication(id);
    }
}
