package com.BootCampProject.service.dtos.requests.Blacklist;

import java.time.LocalDate;

public record UpdateBlacklistRequest(int id,int applicantId, String reason, LocalDate date) {
}
