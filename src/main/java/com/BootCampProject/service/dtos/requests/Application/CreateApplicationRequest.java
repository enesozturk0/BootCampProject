package com.BootCampProject.service.dtos.requests.Application;

import com.BootCampProject.entity.enums.ApplicationState;

public record CreateApplicationRequest(int id, int applicantId, int bootcampId, ApplicationState applicationState) {
}
