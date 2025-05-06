package com.BootCampProject.service.dtos.responses.Blacklist;

import java.time.LocalDate;

public record CreateBlacklistResponse(int id, int applicantId, String reason, LocalDate date) {
}
