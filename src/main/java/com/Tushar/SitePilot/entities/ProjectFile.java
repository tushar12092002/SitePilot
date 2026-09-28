package com.Tushar.SitePilot.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectFile {
    Long id ;
    Project project ;
    String path ;
    String minioObjectKey ;
    Instant created_at;
    Instant updated_at ;
    User created_by ;
    User updated_by ;
}
