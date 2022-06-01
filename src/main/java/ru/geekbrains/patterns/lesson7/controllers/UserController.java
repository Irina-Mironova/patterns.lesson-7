package ru.geekbrains.patterns.lesson7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.patterns.lesson7.services.UserService;


@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users_all")
    public String showUsersAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users_all";
    }

    @RequestMapping("/user_show/{id}")
    public String showUserById(Model model, @PathVariable Long id) {
        model.addAttribute("user", userService.findById(id).get());
        return "user_info";
    }

}
