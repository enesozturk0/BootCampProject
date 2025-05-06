package com.BootCampProject.service.dtos.requests.Blacklist;

import java.time.LocalDate;

public record CreateBlacklistRequest (int applicatnId, String reason, LocalDate date){
}
