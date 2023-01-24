package com.example.tddadvancedschoolassignment.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private UserDetailsService userDetailsService;
    private UserDetails userDetails;
    private PasswordEncoder passwordEncoder;

    public boolean authentication(String username, String password) {
        userDetails=userDetailsService.loadUserByUsername(username);

        if(passwordEncoder.matches(password, userDetails.getPassword())){
            return true;
        }
        return false;
    }
}
