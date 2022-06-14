package com.example.controller;

import com.example.service.DictionaryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/tudien")
    public String greeting() {
        return "home";
    }
    @PostMapping("/tudien")
    public String greetingLate(@RequestParam String name, Model model) {
        model.addAttribute("name",DictionaryServiceImp.late(name));
        return "home";
    }
}
