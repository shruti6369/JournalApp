package net.engineeringdigest.journalapp.controller;

import net.engineeringdigest.journalapp.Repository.UserRepository;
import net.engineeringdigest.journalapp.api.response.WeatherResponse;
import net.engineeringdigest.journalapp.entity.User;
import net.engineeringdigest.journalapp.service.UserService;
import net.engineeringdigest.journalapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WeatherService weatherService;

    @PutMapping
    public ResponseEntity<?>updateUser(@RequestBody User user){
       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
       String userName = authentication.getName();
       User userInDb = userService.findByUserName(userName);
       userInDb.setUserName(user.getUserName());
       userInDb.setPassword(user.getPassword());
       userService.saveNewUser(userInDb);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteUserById(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        userRepository.deleteByUserName(authentication.getName());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping
    public ResponseEntity<?> greeting(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        WeatherResponse weatherResponse =  weatherService.getWeather("Delhi");
        String greeting = "";
        if (weatherResponse != null && weatherResponse.getCurrent() != null) {
            greeting = ", weather feels like " + weatherResponse.getCurrent().getFeelslike();
        } else {
            greeting = ", weather information unavailable";
        }

        return new ResponseEntity<>("Hy " + authentication.getName() + greeting,HttpStatus.OK);
    }


}


