package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.service.customer.ICustomerService;
import com.codegym.casestudy.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerTypeService iCustomerTypeService;
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/customer")
    public String getShowForm(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Customer> list = iCustomerService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listCustomer",list );
        return "list1";
    }
//    @GetMapping("/create")
//    public String create(Model model) {
//        model.addAttribute("customer", new Customer());
//        model.addAttribute("listCustomerType",iCustomerTypeService.findAll());
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public String save(Customer customer) {
//        iCustomerService.create(customer);
//        return "redirect:/customer";
//    }

}
