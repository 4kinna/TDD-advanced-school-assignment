package com.example.tddadvancedschoolassignment.service;

import com.example.tddadvancedschoolassignment.entity.AppUser;
import com.example.tddadvancedschoolassignment.repo.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    AppUserRepo appUserRepo;
    public AppUserService(AppUserRepo appUserRepo) {
        this.appUserRepo=appUserRepo;

    }

    public Optional<AppUser> getUserByUsername(String username) {
        return Optional.of(appUserRepo.getUserByUsername(username).orElseThrow());
    }
}
