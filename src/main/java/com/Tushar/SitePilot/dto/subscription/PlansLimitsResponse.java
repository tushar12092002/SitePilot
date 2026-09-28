package com.Tushar.SitePilot.dto.subscription;

public record PlansLimitsResponse(
        String planName ,
        Integer maxTokensPerDay ,
        Integer maxProjects ,
        Boolean unlimitedAi

) {
}
