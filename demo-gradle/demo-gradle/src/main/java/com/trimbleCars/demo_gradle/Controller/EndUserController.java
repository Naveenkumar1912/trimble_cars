package com.trimbleCars.demo_gradle.Controller;


import com.trimbleCars.demo_gradle.Entity.EndUser;
import com.trimbleCars.demo_gradle.Service.EndUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/end-user")
public class EndUserController {

    @Autowired
    private EndUserService endUserService;

    @PostMapping("/register")
    public EndUser registerEndUser(@RequestBody EndUser endUser) {
        return endUserService.registerEndUser(endUser);
    }
}


