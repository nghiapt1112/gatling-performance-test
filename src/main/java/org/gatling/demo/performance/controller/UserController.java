package org.gatling.demo.performance.controller;


import org.gatling.demo.performance.model.User;
import org.gatling.demo.performance.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thao_test")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @GetMapping("/{userId}")
    public User getUser(@PathVariable String userId) {
        System.out.println("Searching user with userID: " + userId);
        return userService.getUserById(userId);
    }
}
