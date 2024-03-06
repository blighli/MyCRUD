package com.liqilei.mycrud.controller;

import com.liqilei.mycrud.entity.User;
import com.liqilei.mycrud.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepo repo;

    @GetMapping
    Iterable<User> getAll() {
        return repo.findAll();
    }

    @PostMapping
    User add(@RequestBody User user) {
        repo.save(user);
        return user;
    }

    @GetMapping("/{id}")
    Optional<User> get(@PathVariable long id) {
        return repo.findById(id);
    }
}
