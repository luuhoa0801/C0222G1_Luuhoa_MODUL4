package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.User;
import com.codegym.ss7_c0222g1.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/user")
    public String getShowForm(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<User> list = iUserService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listUser", list);
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,
                       RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            return "create";
        }
        iUserService.create(user);
        redirectAttributes.addFlashAttribute("msg", "thêm mới thành công");
        return "redirect:/user";
    }

}
