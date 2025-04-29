package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.Instructor.CreateInstructorRequest;
import com.BootCampProject.service.dtos.requests.Instructor.UpdateInstructorRequest;
import com.BootCampProject.service.dtos.responses.Instructor.CreatedInstructorResponse;
import com.BootCampProject.service.dtos.responses.Instructor.UpdatedInstructorResponse;

public interface InstructorService {
    CreatedInstructorResponse createInstructor(CreateInstructorRequest createInstructorRequest);
    UpdatedInstructorResponse updateInstructor(UpdateInstructorRequest updateInstructorRequest);
}
