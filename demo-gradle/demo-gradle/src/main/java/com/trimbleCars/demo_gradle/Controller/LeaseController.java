package com.trimbleCars.demo_gradle.Controller;

import com.trimbleCars.demo_gradle.Entity.Lease;
import com.trimbleCars.demo_gradle.Service.LeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/lease")
public class LeaseController {

    @Autowired
    private LeaseService leaseService;

    @PostMapping("/start")
    public Lease startLease(@RequestParam Long endUserId, @RequestParam Long carId,
                            @RequestParam LocalDateTime startDate, @RequestParam LocalDateTime endDate) {
        return leaseService.leaseCar(endUserId, carId, startDate, endDate);
    }

    @DeleteMapping("/end/{leaseId}")
    public void endLease(@PathVariable Long leaseId) {
        leaseService.endLease(leaseId);
    }
}

