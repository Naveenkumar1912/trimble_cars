package com.trimbleCars.demo_gradle.Repository;

import com.trimbleCars.demo_gradle.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Long> {
}

