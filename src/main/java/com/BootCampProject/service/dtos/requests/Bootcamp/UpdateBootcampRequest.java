package com.BootCampProject.service.dtos.requests.Bootcamp;

import com.BootCampProject.entity.enums.BootcampState;

import java.time.LocalDate;

public record UpdateBootcampRequest(int id,int instructorId , LocalDate startDate, LocalDate endDate, String city, BootcampState bootcampState) {
}
