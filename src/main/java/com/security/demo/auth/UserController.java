package com.security.demo.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/create/{role}/{username}/{password}")
    public UserEntity create(@ModelAttribute UserEntity userEntity) {
        return userService.createUser(userEntity);
    }



}
