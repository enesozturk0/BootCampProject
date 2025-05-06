package com.BootCampProject.service.mappers;

import com.BootCampProject.entity.Blacklist;
import com.BootCampProject.service.dtos.requests.Blacklist.CreateBlacklistRequest;
import com.BootCampProject.service.dtos.requests.Blacklist.UpdateBlacklistRequest;
import com.BootCampProject.service.dtos.responses.Blacklist.CreateBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetByIdBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.GetListBlacklistResponse;
import com.BootCampProject.service.dtos.responses.Blacklist.UpdateBlacklistResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BlacklistMapper {
    BlacklistMapper INSTANCE = Mappers.getMapper(BlacklistMapper.class);

    @Mapping(source = "applicantId", target = "applicant.id")
    Blacklist blackListFromCreateRequest(CreateBlacklistRequest request);

    @Mapping(source = "applicantId", target = "applicant.id")
    Blacklist blackListFromUpdateRequest(UpdateBlacklistRequest request);

    @Mapping(source = "applicant.id", target = "applicantId")
    CreateBlacklistResponse createResponseFromBlackList(Blacklist blackList);

    @Mapping(source = "applicant.id", target = "applicantId")
    UpdateBlacklistResponse updateResponseFromBlackList(Blacklist blackList);

    @Mapping(source = "applicant.id", target = "applicantId")
    GetByIdBlacklistResponse getByIdResponseFromBlackList(Blacklist blackList);

    @Mapping(source = "applicant.id", target = "applicantId")
    GetListBlacklistResponse getListResponseFromBlackList(Blacklist blackList);

}
