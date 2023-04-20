package com.test.jdatest.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserDAOService service;

    public UserController(UserDAOService service){
        this.service= service;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
            return service.findAll();
    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return service.findOne(id);
    }

}
