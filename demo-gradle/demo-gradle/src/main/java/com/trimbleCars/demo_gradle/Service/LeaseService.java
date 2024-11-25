package com.trimbleCars.demo_gradle.Service;



import com.trimbleCars.demo_gradle.Entity.Car;
import com.trimbleCars.demo_gradle.Entity.EndUser;
import com.trimbleCars.demo_gradle.Entity.Lease;
import com.trimbleCars.demo_gradle.Repository.CarRepository;
import com.trimbleCars.demo_gradle.Repository.EndUserRepository;
import com.trimbleCars.demo_gradle.Repository.LeaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LeaseService {

    @Autowired
    private LeaseRepository leaseRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private EndUserRepository endUserRepository;

    public Lease leaseCar(Long endUserId, Long carId, LocalDateTime startDate, LocalDateTime endDate) {
        EndUser endUser = endUserRepository.findById(endUserId).orElseThrow(() -> new RuntimeException("User not found"));
        Car car = carRepository.findById(carId).orElseThrow(() -> new RuntimeException("Car not found"));

        Lease lease = new Lease();
        lease.setEndUser(endUser);
        lease.setCar(car);
        lease.setStartDate(startDate);
        lease.setEndDate(endDate);

        car.setStatus("ON_LEASE");
        carRepository.save(car);

        return leaseRepository.save(lease);
    }

    public void endLease(Long leaseId) {
        Lease lease = leaseRepository.findById(leaseId).orElseThrow(() -> new RuntimeException("Lease not found"));
        Car car = lease.getCar();
        car.setStatus("IDEAL");
        carRepository.save(car);

        leaseRepository.delete(lease);
    }
}

