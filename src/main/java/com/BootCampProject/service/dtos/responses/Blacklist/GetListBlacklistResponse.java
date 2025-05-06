package com.BootCampProject.service.dtos.responses.Blacklist;

import java.time.LocalDate;

public record GetListBlacklistResponse(int id, int applicantId, String reason, LocalDate date) {
}
