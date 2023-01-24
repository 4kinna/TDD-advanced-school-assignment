package com.example.tddadvancedschoolassignment.repo;

import com.example.tddadvancedschoolassignment.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepo {
    Optional<AppUser> getUserByUsername(String username);
}
