package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String getDictionary() {
        return "home";
    }

    @PostMapping("/save")
    public String save(@RequestParam(name = "check") String[] condiment, Model model) {
        model.addAttribute("result", Arrays.toString(condiment));
        return "save";
    }

}
