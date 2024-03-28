package com.mertbulut.hoaxify.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class UserController {

    @PostMapping("/api/v1/users")
    void createUser(){}
    
    
}
