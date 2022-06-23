package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Pattern(regexp ="^[A-Z]\\w{5,300}$",message = "sai định dạng firstName ")
    @Column(name = "first_name")
    private String firstName;



    @Pattern(regexp ="^[A-Z]\\w{5,300}$",message = "sai định dạng lastName" )
    @Column(name = "last_name")
    private String lastName;


    @Pattern(regexp = "^090[0-9]{7}$",message = "sai định dạng")
    private String phone;


    @Min(value = 18,message = "không được nhỏ hơn 18t")
    @Max(value = 100,message = "không được quá 100t")
    private Integer age;

    @Pattern(regexp = "^[\\w\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",message = "sai đinh dạng")
    private String email;

    public User() {
    }

    public User(@NotBlank(message = "Không được để trống") @Size(min = 5, max = 45) @Pattern(regexp = "^[A-Za-z]*$", message = "sai định dạng") String firstName,
                @NotBlank(message = "Không được để trống") @Pattern(regexp = "^[A-Za-z]*$", message = "sai định dạng")
                @Size(min = 5, max = 45, message = "nhỏ nhất là 5, lớn nhất là 45") String lastName,
                @NotBlank(message = "Không được để trống") @Pattern(regexp = "^090[0-9]{7}$", message = "sai định dạng") String phone,
                @Min(value = 18, message = "không được nhỏ hơn 18t") @Max(value = 100, message = "không được quá 100t") Integer age,
                @Pattern(regexp = "^[\\w\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "sai đinh dạng") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
