package com.codegym.ss7_c0222g1.controller;

import com.codegym.ss7_c0222g1.model.Blog;
import com.codegym.ss7_c0222g1.model.Category;
import com.codegym.ss7_c0222g1.service.IBlogService;
import com.codegym.ss7_c0222g1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/blog")
    public String getShowForm(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Blog> list = iBlogService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listBlog",list );
        return "list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("listCategory",iCategoryService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String save(Blog blog) {
        iBlogService.create(blog.getTitle(),blog.getCreateDay(),blog.getCategory().getIdCategory());
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog) {
        iBlogService.delete(blog.getId());
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        List<Category> categoryList = iBlogService.categoryList();
        model.addAttribute("categoryList",categoryList);
        return "edit";
    }

    @PostMapping("/update")
    public String update(Blog blog) {
        iBlogService.update(blog);
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blog", iBlogService.findById(id));
        return "view";
    }

    @GetMapping("/search")
    public String searchByName(String title, @RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Blog> list = iBlogService.findByTitle(title, PageRequest.of(page, 2));
        model.addAttribute("listBlog", list);
        return "list";
    }
}
