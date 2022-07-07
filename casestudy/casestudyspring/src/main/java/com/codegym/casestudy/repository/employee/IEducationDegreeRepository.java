package com.codegym.casestudy.repository.employee;

import com.codegym.casestudy.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IEducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
}
