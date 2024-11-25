package com.trimbleCars.demo_gradle.Repository;

import com.trimbleCars.demo_gradle.Entity.CarOwner;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CarOwnerRepository extends JpaRepository<CarOwner, Long> {
}

