package com.example.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.models.User;
import com.example.app.repositories.UserRepository;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addUser")
    public String saveUsers(@RequestBody User user) {
        userRepository.save(user);
        return "Added User with ID " + user.getAge();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/findUser/{id}")
    public Optional<User> findUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @GetMapping("/listpage")
    public Page<User> listUsersPaginated(Pageable p) {
        return userRepository.findAll(p);
    }

}
