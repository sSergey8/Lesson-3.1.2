package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserPageController {

    @GetMapping
    public String userPage(Model model, Principal principal) {
        model.addAttribute("username", principal.getName());
        return "user"; // user.html
    }
}
