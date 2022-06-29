package com.codegym.ss7_c0222g1.repository;

import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
