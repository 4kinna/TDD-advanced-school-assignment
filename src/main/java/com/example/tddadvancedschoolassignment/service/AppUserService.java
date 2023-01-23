package com.example.tddadvancedschoolassignment.service;

import com.example.tddadvancedschoolassignment.entity.AppUser;
import com.example.tddadvancedschoolassignment.repo.AppUserRepo;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    public AppUserService(AppUserRepo appUserRepo) {
    }

    public AppUser getUserByUsername(String username) {
        return null;
    }
}
