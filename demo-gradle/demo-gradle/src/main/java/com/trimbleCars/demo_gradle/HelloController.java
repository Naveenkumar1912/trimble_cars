package com.trimbleCars.demo_gradle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {

    @GetMapping("/get/message")
    public String getMessage()
    {
        return "Welcome";
    }
}
