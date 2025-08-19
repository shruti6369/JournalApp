package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalapp.Repository.UserRepository;
import net.engineeringdigest.journalapp.entity.User;
import net.engineeringdigest.journalapp.service.UserDetailServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.when;


public class UserDetailServiceImplTest {

    @InjectMocks
    private UserDetailServiceImpl userDetailService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void loadUserByUsernameTest() {
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("shruti").password("shruti").roles(new ArrayList<>()).build());
        UserDetails user = userDetailService.loadUserByUsername("shruti");
        Assertions.assertNotNull(user);
    }


}
