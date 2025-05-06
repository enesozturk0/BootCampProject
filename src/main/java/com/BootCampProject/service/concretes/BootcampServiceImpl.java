package com.BootCampProject.service.concretes;

import com.BootCampProject.entity.BootCamp;
import com.BootCampProject.entity.enums.BootcampState;
import com.BootCampProject.repository.BootcampRepository;
import com.BootCampProject.service.abstracts.BootcampService;
import com.BootCampProject.service.dtos.requests.Bootcamp.CreateBootcampRequest;
import com.BootCampProject.service.dtos.requests.Bootcamp.UpdateBootcampRequest;
import com.BootCampProject.service.dtos.responses.Bootcamp.CreateBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetByIdBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetListBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.UpdateBootcampResponse;
import com.BootCampProject.service.mappers.BootcampMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BootcampServiceImpl implements BootcampService {

    private final BootcampRepository repository;

    public BootcampServiceImpl(BootcampRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreateBootcampResponse add(CreateBootcampRequest request) {
        BootCamp bootcamp = BootcampMapper.INSTANCE.bootcampFromCreateRequest(request);
        bootcamp = repository.save(bootcamp);
        return BootcampMapper.INSTANCE.createResponseFromBootcamp(bootcamp);
    }

    @Override
    public UpdateBootcampResponse update(UpdateBootcampRequest request) {
        BootCamp existing = repository.findById(request.id())
                .orElseThrow(() -> new RuntimeException("Bootcamp not found by id: " + request.id()));

        BootCamp updated = BootcampMapper.INSTANCE.bootcampFromUpdateRequest(request);
        updated.setId(existing.getId());
        BootCamp saved = repository.save(updated);

        return BootcampMapper.INSTANCE.updateResponseFromBootcamp(saved);
    }

    @Override
    public void delete(int id) {
        BootCamp bootcamp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bootcamp not found by id: " + id));

        repository.delete(bootcamp);
    }

    @Override
    public GetByIdBootcampResponse getById(int id) {
        BootCamp bootcamp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bootcamp not found by id: " + id));
        return BootcampMapper.INSTANCE.getByIdResponseFromBootcamp(bootcamp);
    }

    @Override
    public List<GetListBootcampResponse> getAll() {
        return repository.findAll().stream()
                .map(BootcampMapper.INSTANCE::getListResponseFromBootcamp)
                .collect(Collectors.toList());
    }

    @Override
    public List<GetListBootcampResponse> getByState(BootcampState state) {
        return repository.findByBootcampState(state).stream()
                .map(BootcampMapper.INSTANCE::getListResponseFromBootcamp)
                .collect(Collectors.toList());
    }
}
