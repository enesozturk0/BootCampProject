package com.BootCampProject.service.dtos.responses.Blacklist;

import java.time.LocalDate;

public record UpdateBlacklistResponse(int id, int applicantId, String reason, LocalDate date) {
}
