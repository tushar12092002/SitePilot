package com.Tushar.SitePilot.dto.subscription;


public record UsageTodayResponse (
    Integer TokenUsed ,
    Integer TokenLimit,
    Integer previewsRunning ,
    Integer previewLimit
    ){}
