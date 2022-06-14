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
     * Teen ph?i có ý ngh?a => greeting1
     * Tên bi?n, url, ... ph?i ti?ng anh => tiente
     * nh?ng x? lý tính toán s? x? lý ? service => usd * 23000; => (x? lý ? service)
     *
     */
}
