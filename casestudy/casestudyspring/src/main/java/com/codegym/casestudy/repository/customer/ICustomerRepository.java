package com.codegym.casestudy.repository.customer;

import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICustomerRepository  extends JpaRepository<Customer,String> {
    @Query(value = "select * from customer where status = 0",nativeQuery = true)
    Page<Customer> findAllCustomer(Pageable pageable);
}
