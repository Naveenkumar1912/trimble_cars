package com.trimbleCars.demo_gradle.Repository;

import com.trimbleCars.demo_gradle.Entity.Lease;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LeaseRepository extends JpaRepository<Lease, Long> {
    List<Lease> findByEndUserId(Long endUserId);
}

