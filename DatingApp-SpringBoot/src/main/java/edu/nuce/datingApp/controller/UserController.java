/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nuce.datingApp.controller;

import edu.nuce.datingApp.model.User;
import edu.nuce.datingApp.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author duckh
 */
@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class UserController {
    UserRepository userRepository;
    
    @GetMapping(path = "user/all")
    public List<User> getAll() {
        return userRepository.findAll();
    }
    
    @GetMapping("user/{username}")
    public Optional<User> getByUsername(@PathVariable String username) {
        return userRepository.findAll().stream().filter(u -> username.equals(u.getUsername())).findFirst();
    }
}
