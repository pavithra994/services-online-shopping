package com.project.onlineShopping.services;
import com.project.onlineShopping.models.User;
import com.project.onlineShopping.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        // logic
        return userRepository.save(user);
    }
}
