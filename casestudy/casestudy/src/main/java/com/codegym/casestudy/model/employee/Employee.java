package com.codegym.casestudy.model;

import javax.persistence.Column;

public class Employee {
    @Column(name = "employee_id")
    private int employee_id;

    @Column(name = "employee_name")
    private  String employee_name;

    @Column(name = "employee_birthday")
    private String employee_birthday;

    @Column(name = "employee_id_card")
    private String employee_id_card;

    @Column(name = "employee_salary")
    private double employee_salary;

    @Column(name = "employee_phone")
    private String employee_phone;

    @Column(name = "employee_email")
    private String employee_email;

    @Column(name = "employee_address")
    private String employee_address;

    private int position_id;
    private int education_degree_id;
    private int division_id;
    private String username;
    private int status;

}
