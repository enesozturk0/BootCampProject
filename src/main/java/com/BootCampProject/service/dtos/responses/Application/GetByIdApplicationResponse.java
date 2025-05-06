package com.BootCampProject.service.dtos.responses.Application;

import com.BootCampProject.entity.enums.ApplicationState;

public record GetByIdApplicationResponse(int id , int applicantId, int bootcampId, ApplicationState applicationState) {
}
