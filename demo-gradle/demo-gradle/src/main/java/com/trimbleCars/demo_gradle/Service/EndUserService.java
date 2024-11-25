package com.trimbleCars.demo_gradle.Service;


import com.trimbleCars.demo_gradle.Entity.EndUser;
import com.trimbleCars.demo_gradle.Repository.EndUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EndUserService {

    @Autowired
    private EndUserRepository endUserRepository;

    public EndUser registerEndUser(EndUser endUser) {
        return endUserRepository.save(endUser);
    }
}


