package com.Tushar.SitePilot.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id ;
    User user ;
    Plan plan ;
    String stripeCustomerId ;
    String stripeSubscriptionId ;
    SubscriptionStatus status ;
    Instant current_period_start ;
    Instant current_period_end ;
    Boolean cancel_at_period_end ;
    Instant created_at ;
    Instant updated_at ;

}
