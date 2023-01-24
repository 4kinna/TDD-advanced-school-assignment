package com.example.tddadvancedschoolassignment.service;

import com.example.tddadvancedschoolassignment.entity.AppUser;


import com.example.tddadvancedschoolassignment.repo.AppUserRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
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
    public void checkUsernameAndPassword_ifMatch_returnUser() {
        //given

        //when
        when(appUserRepo.getUserByUsername(appUser.getUsername())).thenReturn(Optional.of(appUser));
        Optional<AppUser> returnedAppUser = appUserService.getUserByUsername(appUser.getUsername());

        //then
        assertEquals(Optional.of(appUser), returnedAppUser);
    }
}
