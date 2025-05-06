package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.Blacklist.CreateBlacklistRequest;
import com.BootCampProject.service.dtos.requests.Blacklist.UpdateBlacklistRequest;
import com.BootCampProject.service.dtos.responses.Blacklist.CreateBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetByIdBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetListBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.UpdateBlacklistResponse;

import java.util.List;

public interface BlacklistService {
    CreateBlacklistResponse add(CreateBlacklistRequest request);
    UpdateBlacklistResponse update(UpdateBlacklistRequest request);
    void delete(int id);

    GetByIdBlacklistResponse getById(int id);
    List<GetListBlacklistResponse> getAll();
}
