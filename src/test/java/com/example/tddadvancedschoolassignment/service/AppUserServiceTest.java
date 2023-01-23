package com.example.tddadvancedschoolassignment.service;

import com.example.tddadvancedschoolassignment.entity.AppUser;


import com.example.tddadvancedschoolassignment.repo.AppUserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class AppUserServiceTest {
    @Mock
    private AppUserRepo appUserRepo;
    private AppUser appUser;
    private AppUserService appUserService;

    @BeforeEach
    public void startUp() {
        appUserService = new AppUserService(appUserRepo);
        appUser = new AppUser("Ankan", "1234");
    }

    @Test
    public void checkUsernameAndPassword_ifMatch_returnValidToken() {
        //given

        //when
        when(appUserRepo.getUserByUsername(appUser.getUsername())).thenReturn(appUser);
        AppUser returnedAppUser = appUserService.getUserByUsername(appUser.getUsername());

        //then
        assertEquals(appUser, returnedAppUser);
    }
}
