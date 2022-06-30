package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.model.Category;
import com.codegym.ss7_c0222g1.service.IBlogService;
import com.codegym.ss7_c0222g1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/blog")
    public Page<Blog> getShowBlog(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Blog> list = iBlogService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listBlog", list);
        return list;
    }

    @GetMapping("/category")
    public List<Category> getShowCateLory() {
        List<Category> listCate = iCategoryService.findAll();
        return listCate;
    }

    @GetMapping("/{id}/blog")
    public ResponseEntity<Blog> view(@PathVariable Integer id) {
        Blog blog = iBlogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("{idCategory}/viewCate")
    public Set<Blog> viewBlog(@PathVariable Integer idCategory) {
        Set<Blog> listBlog = iCategoryService.search(idCategory).getBlog();
        return listBlog;
    }

}
