package com.BootCampProject.service.concretes;

import org.springframework.stereotype.Service;
import com.BootCampProject.service.abstracts.InstructorService;
import com.BootCampProject.service.dtos.requests.Instructor.CreateInstructorRequest;
import com.BootCampProject.service.dtos.requests.Instructor.UpdateInstructorRequest;
import com.BootCampProject.service.dtos.responses.Instructor.CreatedInstructorResponse;
import com.BootCampProject.service.dtos.responses.Instructor.UpdatedInstructorResponse;

@Service
public class InstructorServiceImpl implements InstructorService {
    @Override
    public CreatedInstructorResponse createInstructor(CreateInstructorRequest createInstructorRequest) {
        return null;
    }

    @Override
    public UpdatedInstructorResponse updateInstructor(UpdateInstructorRequest updateInstructorRequest) {
        return null;
    }
}
