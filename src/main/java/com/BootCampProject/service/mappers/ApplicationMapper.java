package com.BootCampProject.service.mappers;

import com.BootCampProject.entity.Application;
import com.BootCampProject.service.dtos.requests.Application.CreateApplicationRequest;
import com.BootCampProject.service.dtos.requests.Application.UpdateApplicationRequest;
import com.BootCampProject.service.dtos.responses.Application.CreateApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetByIdApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.GetListApplicationResponse;
import com.BootCampProject.service.dtos.responses.Application.UpdateApplicationResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApplicationMapper {

    ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);

    @Mapping(source = "applicantId", target = "applicant.id")
    @Mapping(source = "bootcampId", target = "bootcamp.id")
    Application applicationFromCreateRequest(CreateApplicationRequest request);

    @Mapping(source = "applicantId", target = "applicant.id")
    @Mapping(source = "bootcampId", target = "bootcamp.id")
    Application applicationFromUpdateRequest(UpdateApplicationRequest request);

    @Mapping(source = "applicant.id", target = "applicantId")
    @Mapping(source = "bootcamp.id", target = "bootcampId")
    CreateApplicationResponse createResponseFromApplication(Application application);

    @Mapping(source = "applicant.id", target = "applicantId")
    @Mapping(source = "bootcamp.id", target = "bootcampId")
    UpdateApplicationResponse updateResponseFromApplication(Application application);

    @Mapping(source = "applicant.id", target = "applicantId")
    @Mapping(source = "bootcamp.id", target = "bootcampId")
    GetByIdApplicationResponse getByIdResponseFromApplication(Application application);

    @Mapping(source = "applicant.id", target = "applicantId")
    @Mapping(source = "bootcamp.id", target = "bootcampId")
    GetListApplicationResponse getListResponseFromApplication(Application application);
}
