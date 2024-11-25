package com.trimbleCars.demo_gradle.Service;

import com.trimbleCars.demo_gradle.Entity.Car;
import com.trimbleCars.demo_gradle.Entity.CarOwner;
import com.trimbleCars.demo_gradle.Repository.CarOwnerRepository;
import com.trimbleCars.demo_gradle.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarOwnerRepository carOwnerRepository;

    public CarOwner getCarOwnerById(Long ownerId) {
        return carOwnerRepository.findById(ownerId).orElse(null); // fetch owner by ID
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
}


