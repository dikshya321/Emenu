package com.ncit.emenu.service;

import com.ncit.emenu.model.User;
import com.ncit.emenu.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private UserRepo userRepo;
    
    public User loginUser(String email){
        return userRepo.findByEmail(email);
    }
}
