package com.codegym.ss7_c0222g1.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Integer idCategory;
    private String content;

    @OneToMany(mappedBy = "category")
    private Set<Blog> blog;

    public Set<Blog> getBlog() {
        return blog;
    }

    public void setBlog(Set<Blog> blog) {
        this.blog = blog;
    }

    public Category() {
    }

    public Category(String content, Set<Blog> blog) {
        this.content = content;
        this.blog = blog;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
