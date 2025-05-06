package com.BootCampProject.service.concretes;

import com.BootCampProject.entity.Application;
import com.BootCampProject.repository.ApplicationRepository;
import com.BootCampProject.service.abstracts.ApplicationService;
import com.BootCampProject.service.dtos.requests.Application.CreateApplicationRequest;
import com.BootCampProject.service.dtos.requests.Application.UpdateApplicationRequest;
import com.BootCampProject.service.dtos.responses.Application.CreateApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetByIdApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetListApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.UpdateApplicationResponse;
import com.BootCampProject.service.mappers.ApplicationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository repository;

    public ApplicationServiceImpl(ApplicationRepository repository) {
        this.repository = repository;
    }


    @Override
    public CreateApplicationResponse add(CreateApplicationRequest request) {
        Application application = ApplicationMapper.INSTANCE.applicationFromCreateRequest(request);
        application = repository.save(application);
        return ApplicationMapper.INSTANCE.createResponseFromApplication(application);
    }

    @Override
    public UpdateApplicationResponse update(UpdateApplicationRequest request) {
        Application existing = repository.findById(request.id())
                .orElseThrow(() -> new RuntimeException("Application not found by id: " + request.id()));

        Application updated = ApplicationMapper.INSTANCE.applicationFromUpdateRequest(request);
        updated.setId(existing.getId());
        Application saved = repository.save(updated);

        return ApplicationMapper.INSTANCE.updateResponseFromApplication(saved);
    }

    @Override
    public void deleteApplication(int id) {
        Application application = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found by id: " + id));

        repository.delete(application);
    }

    @Override
    public GetByIdApplicationResponse getById(int id) {
        Application application = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found by id: " + id));
        return ApplicationMapper.INSTANCE.getByIdResponseFromApplication(application);
    }

    @Override
    public List<GetListApplicationResponse> getAll() {
        return repository.findAll().stream()
                .map(ApplicationMapper.INSTANCE::getListResponseFromApplication)
                .collect(Collectors.toList());
    }

    @Override
    public List<GetListApplicationResponse> getByApplicantId(int applicantId) {
        return repository.findByApplicantId(applicantId).stream()
                .map(ApplicationMapper.INSTANCE::getListResponseFromApplication)
                .collect(Collectors.toList());
    }
    }


