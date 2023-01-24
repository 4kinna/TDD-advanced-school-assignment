package com.example.tddadvancedschoolassignment.service;

import com.example.tddadvancedschoolassignment.entity.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginServiceTest {
    private AppUser appUser;
    private LoginService loginService;

    @BeforeEach()
    public void startUp() {
        appUser = new AppUser("Ankan", "1234");
    }


    @Test
    public void login_ifAuthenticated_shouldReturnToken() {
        //Given

        //When
        boolean auth = loginService.authentication(appUser.getUsername(), appUser.getPassword());

        //Then
        assertTrue(auth);

    }


}
