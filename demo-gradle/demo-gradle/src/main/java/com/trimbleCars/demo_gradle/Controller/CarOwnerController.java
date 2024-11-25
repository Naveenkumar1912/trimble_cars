package com.trimbleCars.demo_gradle.Controller;


import com.trimbleCars.demo_gradle.Entity.CarOwner;
import com.trimbleCars.demo_gradle.Service.CarOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/car-owner")
public class CarOwnerController {

    @Autowired
    private CarOwnerService carOwnerService;

    @PostMapping("/register")
    public CarOwner registerCarOwner(@RequestBody CarOwner carOwner) {
        return carOwnerService.registerCarOwner(carOwner);
    }
}


