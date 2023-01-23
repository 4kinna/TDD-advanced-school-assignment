package com.example.tddadvancedschoolassignment.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppUserTest {

    private AppUser appUser;

    @BeforeEach
    public void startUp(){
        appUser= new AppUser("Ankan", "1234");
    }

    @Test
    public void checkSameUser_sameUser_returnUser(){
        //Given

        //When
        String username= appUser.getUsername();
        String password= appUser.getPassword();

        //Then
        assertAll(()->assertEquals(new AppUser(username,password), appUser));
    }


}
