package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalapp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendEmail(){
        emailService.sendEmail("shrutisharma6369@gmail.com",
                "Testing java mail sender",
                "Hi,aap kaise hain ?");
    }
}
