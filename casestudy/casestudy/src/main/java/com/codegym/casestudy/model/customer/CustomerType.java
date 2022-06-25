package com.codegym.casestudy.model;

import javax.persistence.Column;

public class CustomerType {
    @Column(name = "customer_type_id")
    private int id;
    @Column(name = "customer_type_name")
    private String name;
}
