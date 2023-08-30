package com.jacobdgraham.ats.controller;

import com.jacobdgraham.ats.entity.UserForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserRegistrationFormController {

    @GetMapping("/registration")
    public String registrationForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "registrationForm";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("userForm") @Valid UserForm userForm, BindingResult bindingResult, Model model) {
        model.addAttribute("userForm", userForm);
        bindingResult.hasErrors();
        return "registrationForm";
    }
}
