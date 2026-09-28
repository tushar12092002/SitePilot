package com.Tushar.SitePilot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id ;
    String name ;
    String stripe_price_id ;
    Integer max_projects ;
    Integer max_tokens_per_day ;
    Integer max_preview ;
    Boolean unlimited_ai ;
    Boolean active ;

}
