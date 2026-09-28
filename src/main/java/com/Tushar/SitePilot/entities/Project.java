package com.Tushar.SitePilot.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @Column(nullable = false)
    private String name ;

    @ManyToOne
    @JoinColumn(name = "owner_id" ,nullable = false)
    User owner ;

    private Boolean is_public ;
    @CreationTimestamp
    private LocalDate created_at ;
    @UpdateTimestamp
    private LocalDate updated_at ;

    private LocalDate deleted_at ;
}
