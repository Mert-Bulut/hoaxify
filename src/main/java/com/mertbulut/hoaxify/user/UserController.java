package com.mertbulut.hoaxify.user;

import org.springframework.web.bind.annotation.RestController;

import com.mertbulut.hoaxify.shared.GenericMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/api/v1/users")
    GenericMessage createUser(@RequestBody User user){
        userService.save(user);
        return new GenericMessage("User is created");
    }
    
}
