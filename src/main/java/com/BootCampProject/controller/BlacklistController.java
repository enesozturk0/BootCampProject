package com.BootCampProject.controller;

import com.BootCampProject.service.abstracts.BlacklistService;
import com.BootCampProject.service.dtos.requests.Blacklist.CreateBlacklistRequest;
import com.BootCampProject.service.dtos.requests.Blacklist.UpdateBlacklistRequest;
import com.BootCampProject.service.dtos.responses.Blacklist.CreateBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetByIdBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetListBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.UpdateBlacklistResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blacklist")
public class BlacklistController {

    private final BlacklistService blacklistService;

    public BlacklistController(BlacklistService blacklistService) {
        this.blacklistService = blacklistService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListBlacklistResponse> getAll(){
        return blacklistService.getAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetByIdBlacklistResponse getById(@PathVariable int id){
        return blacklistService.getById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdateBlacklistResponse update(@RequestBody UpdateBlacklistRequest request){
        return blacklistService.update(request);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateBlacklistResponse add(@RequestBody CreateBlacklistRequest request){
        return blacklistService.add(request);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id){
        blacklistService.delete(id);
    }
}
