package com.project.onlineShopping.resources;

import com.project.onlineShopping.models.User;
import com.project.onlineShopping.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/createUser")
    public String createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return "Added user with id : " + user1.getUid();
    }

}
