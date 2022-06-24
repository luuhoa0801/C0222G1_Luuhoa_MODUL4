package com.codegym.music.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "^[A-Za-z-0-9 ]*$", message = "sai định dạng name ")
    @Size(min = 1, max = 800, message = "không quá 800 từ")
    private String name;

    @Pattern(regexp = "^[A-Za-z-0-9 ]*$", message = "Sai định dạng ")
    @Size(min = 1, max = 300, message = "không quá 300 từ")
    @Column(name = "show_man")
    private String showMan;

    @Pattern(regexp = "^[A-Za-z-0-9, ]*$", message = "Sai định dạng ")
    @Size(min = 1, max = 1000, message = "không quá 1000 từ")
    private String category;

    public Music() {
    }

    public Music(@Pattern(regexp = "^[A-Za-z-0-9, ]*$", message = "sai định dạng name ") @Size(min = 1, max = 800, message = "không quá 800 từ") String name,
                 @Pattern(regexp = "^[A-Za-z-0-9, ]*$", message = "Sai định dạng ") @Size(min = 1, max = 300, message = "không quá 300 từ") String showMan,
                 @Size(min = 1, max = 1000, message = "không quá 1000 từ") String category) {
        this.name = name;
        this.showMan = showMan;
        this.category = category;
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

    public String getShowMan() {
        return showMan;
    }

    public void setShowMan(String showMan) {
        this.showMan = showMan;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
