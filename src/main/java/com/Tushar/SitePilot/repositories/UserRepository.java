package com.Tushar.SitePilot.repositories;

import com.Tushar.SitePilot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
