package com.Tushar.SitePilot.dto.Project;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id ,
        String name ,
        Instant CreatedAt,
        Instant UpdatedAt
) {
}
