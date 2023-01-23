package com.example.tddadvancedschoolassignment.repo;

import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo {
    Object getUserByUsername(String username);
}
