package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalapp.Repository.UserRepositoryImpl;
import net.engineeringdigest.journalapp.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserRepositoryImplTest {

    @Autowired
    private UserRepositoryImpl userRepository;


    @Test
    public void testSaveNewUser() {
        Assertions.assertNotNull(userRepository.getUserForSA());


    }
}
