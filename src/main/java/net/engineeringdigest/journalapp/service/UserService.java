package net.engineeringdigest.journalapp.service;

import net.engineeringdigest.journalapp.Repository.UserRepository;
import net.engineeringdigest.journalapp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void save(User user){
        userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);

    }
}
