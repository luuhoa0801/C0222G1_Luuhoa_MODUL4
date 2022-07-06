package com.codegym.casestudy.repository.employee;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "select * from employee where status = 0",nativeQuery = true)
    Page<Employee> findAllEmployee(Pageable pageable);

}

