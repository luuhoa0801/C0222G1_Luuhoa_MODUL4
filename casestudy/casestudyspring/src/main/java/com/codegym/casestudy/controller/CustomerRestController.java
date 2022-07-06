package com.codegym.casestudy.controller;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.service.customer.ICustomerService;
import com.codegym.casestudy.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customerRest")
public class CustomerRestController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping(value = "list")
    public ResponseEntity<List<Customer>> allCustomer() {
        return new ResponseEntity<>(iCustomerService.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "save")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        iCustomerService.create(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Customer>> searchById(@PathVariable String name) {
        List<Customer> customer = iCustomerService.findByName("%" + name + "%");
        if (customer.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
