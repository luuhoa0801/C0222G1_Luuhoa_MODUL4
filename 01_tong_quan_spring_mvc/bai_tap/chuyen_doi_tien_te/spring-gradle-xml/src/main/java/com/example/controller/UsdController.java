package com.example.controller;


import com.example.service.UsdService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("bt")
public class UsdController {
    @GetMapping("/usd")
    public String getUsd() {
        return "home";
    }

    @PostMapping("/money")
    public String PostUsd(@RequestParam(name = "usd") int usd, Model model) {
        model.addAttribute("result",UsdService.usdNumber(usd));
        model.addAttribute("usd",usd);
        return "home";
    }

    /**
     * Teen ph?i c� � ngh?a => greeting1
     * T�n bi?n, url, ... ph?i ti?ng anh => tiente
     * nh?ng x? l� t�nh to�n s? x? l� ? service => usd * 23000; => (x? l� ? service)
     *
     */
}
