package com.trimbleCars.demo_gradle.Repository;

import com.trimbleCars.demo_gradle.Entity.EndUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EndUserRepository extends JpaRepository<EndUser, Long> {
}

