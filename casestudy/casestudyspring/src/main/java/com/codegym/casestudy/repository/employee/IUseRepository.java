package com.codegym.casestudy.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;

public interface IUseRepository extends JpaRepository<SOAPBinding.Use,Integer> {

}
