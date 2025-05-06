package com.BootCampProject.controller;

import com.BootCampProject.entity.enums.BootcampState;
import com.BootCampProject.service.abstracts.BootcampService;
import com.BootCampProject.service.dtos.requests.Bootcamp.CreateBootcampRequest;
import com.BootCampProject.service.dtos.requests.Bootcamp.UpdateBootcampRequest;
import com.BootCampProject.service.dtos.responses.Bootcamp.CreateBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetByIdBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetListBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.UpdateBootcampResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bootcamp")
public class BootcampController {

    private final BootcampService bootcampService;

    public BootcampController(BootcampService bootcampService) {
        this.bootcampService = bootcampService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListBootcampResponse> getAll() {
        return bootcampService.getAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetByIdBootcampResponse getById(@PathVariable int id) {
        return bootcampService.getById(id);
    }

    @GetMapping("state/{state}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetListBootcampResponse> getByState(@PathVariable BootcampState state) {
        return bootcampService.getByState(state);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdateBootcampResponse update(@RequestBody UpdateBootcampRequest request) {
        return bootcampService.update(request);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBootcampResponse add(@RequestBody CreateBootcampRequest request) {
        return bootcampService.add(request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id) {
        bootcampService.delete(id);
    }



}
