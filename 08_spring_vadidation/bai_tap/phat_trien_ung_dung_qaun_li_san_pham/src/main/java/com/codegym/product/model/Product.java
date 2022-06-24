package com.codegym.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "^[A-Za-z-0-9, ]*$", message = "sai định dạng name ")
    @Size(min = 1, max = 800, message = "không quá 800 từ")
    private String name;

    @Min(value = 1, message = "Gía không âm")
    private double price;

    @Size(min = 1, max = 300, message = "không quá 300,k để trống")
    private String status;

    @Size(min = 1, max = 300, message = "không quá 300,k để trống")
    private String producer;

    public Product() {
    }

    public Product(@Pattern(regexp = "^[A-Za-z-0-9, ]*$", message = "sai định dạng name ")
                   @Size(min = 1, max = 800, message = "không quá 800 từ") String name,
                   @Min(value = 1, message = "Gía không âm") double price,
                   @Size(min = 1, max = 300, message = "không quá 300,k để trống") String status,
                   @Size(min = 1, max = 300, message = "không quá 300,k để trống") String producer) {
        this.name = name;
        this.price = price;
        this.status = status;
        this.producer = producer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
