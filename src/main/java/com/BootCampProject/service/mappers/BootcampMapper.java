package com.BootCampProject.service.mappers;

import com.BootCampProject.entity.BootCamp;
import com.BootCampProject.service.dtos.requests.Bootcamp.CreateBootcampRequest;
import com.BootCampProject.service.dtos.requests.Bootcamp.UpdateBootcampRequest;
import com.BootCampProject.service.dtos.responses.Bootcamp.CreateBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetByIdBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.GetListBootcampResponse;
import com.BootCampProject.service.dtos.responses.Bootcamp.UpdateBootcampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BootcampMapper {
    BootcampMapper INSTANCE = Mappers.getMapper(BootcampMapper.class);

    @Mapping(source = "instructorId", target = "instructor.id")
    BootCamp bootcampFromCreateRequest(CreateBootcampRequest request);

    @Mapping(source = "instructorId", target = "instructor.id")
    BootCamp bootcampFromUpdateRequest(UpdateBootcampRequest request);

    @Mapping(source = "instructor.id", target = "instructorId")
    CreateBootcampResponse createResponseFromBootcamp(BootCamp bootcamp);

    @Mapping(source = "instructor.id", target = "instructorId")
    UpdateBootcampResponse updateResponseFromBootcamp(BootCamp bootcamp);

    @Mapping(source = "instructor.id", target = "instructorId")
    GetByIdBootcampResponse getByIdResponseFromBootcamp(BootCamp bootcamp);

    @Mapping(source = "instructor.id", target = "instructorId")
    GetListBootcampResponse getListResponseFromBootcamp(BootCamp bootcamp);
}
