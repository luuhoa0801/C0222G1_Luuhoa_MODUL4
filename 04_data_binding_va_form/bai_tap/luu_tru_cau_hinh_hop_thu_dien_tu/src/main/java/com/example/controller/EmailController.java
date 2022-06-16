package com.example.controller;

import com.example.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailController {
    @GetMapping("/email")
    public String showForm(Model model) {
        model.addAttribute("email", new Email());
        String[] languages = new String[]{"English", "Vietnamese", "Japanese", "Chinese"};
        int[] size = new int[]{5, 10, 15, 25, 50, 100};
        model.addAttribute("listLanguages", languages);
        model.addAttribute("listSize", size);
        return "create";
    }

    @PostMapping("/addEmail")
    public String addEmail(@ModelAttribute("email") Email email, Model model) {
        model.addAttribute("email", email);
        return "show";
    }
}
