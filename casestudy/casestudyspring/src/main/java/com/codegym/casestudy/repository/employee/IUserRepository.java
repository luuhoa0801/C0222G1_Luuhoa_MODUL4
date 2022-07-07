package com.codegym.casestudy.repository.employee;

import com.codegym.casestudy.model.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User,Integer> {

}
