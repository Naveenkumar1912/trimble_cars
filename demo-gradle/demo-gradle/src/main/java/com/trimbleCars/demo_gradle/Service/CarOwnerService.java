package com.trimbleCars.demo_gradle.Service;


import com.trimbleCars.demo_gradle.Entity.CarOwner;
import com.trimbleCars.demo_gradle.Repository.CarOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CarOwnerService {

    @Autowired
    private CarOwnerRepository carOwnerRepository;

    public CarOwner registerCarOwner(CarOwner carOwner) {
        return carOwnerRepository.save(carOwner);
    }
}
