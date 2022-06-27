package com.codegym.casestudy.service.customer;

import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> getAll(Pageable pageable);
    void create(Customer customer);
    void delete(Integer id);
    Customer findById(Integer id);
}
