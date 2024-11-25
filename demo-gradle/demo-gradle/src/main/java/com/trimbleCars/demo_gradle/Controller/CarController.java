package com.trimbleCars.demo_gradle.Controller;


import com.trimbleCars.demo_gradle.Entity.Car;
import com.trimbleCars.demo_gradle.Entity.CarOwner;
import com.trimbleCars.demo_gradle.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/car-owner")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/{ownerId}/car/register")
    public ResponseEntity<Car> registerCar(@PathVariable Long ownerId, @RequestBody Car car) {

        CarOwner owner = carService.getCarOwnerById(ownerId);
        if (owner == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        car.setOwner(owner); // Associate car with the car owner
        Car registeredCar = carService.saveCar(car); // Save car with owner association
        return new ResponseEntity<>(registeredCar, HttpStatus.CREATED);
    }
}


