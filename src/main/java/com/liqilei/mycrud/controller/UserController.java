package com.liqilei.mycrud.controller;

import com.liqilei.mycrud.entity.User;
import com.liqilei.mycrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepo repo;

    @GetMapping
    Iterable<User> getAll() {
        return repo.findAll();
    }

}
