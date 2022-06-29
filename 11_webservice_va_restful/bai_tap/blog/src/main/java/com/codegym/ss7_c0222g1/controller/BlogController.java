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
import org.springframework.web.bind.annotation.*;

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
        if (blog==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping("{idCategory}/viewCate")
    public Set<Blog> viewBlog(@PathVariable Integer idCategory) {
        Set<Blog> listBlog = iCategoryService.search(idCategory).getBlog();
        return listBlog;
    }

//    @GetMapping("/create")
//    public String create(Model model) {
//        model.addAttribute("blog", new Blog());
//        model.addAttribute("listCategory", iCategoryService.findAll());
//        return "create";
//    }
//
//    @PostMapping("/create")
//    public String save(Blog blog) {
//        iBlogService.create(blog.getTitle(), blog.getCreateDay(), blog.getCategory().getIdCategory());
//        return "redirect:/blog";
//    }
//
//    @GetMapping("/{id}/delete")
//    public String delete(@PathVariable int id, Model model) {
//        model.addAttribute("blog", iBlogService.findById(id));
//        return "delete";
//    }
//
//    @PostMapping("/delete")
//    public String delete(Blog blog) {
//        iBlogService.delete(blog.getId());
//        return "redirect:/blog";
//    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(@PathVariable int id, Model model) {
//        model.addAttribute("blog", iBlogService.findById(id));
//        List<Category> categoryList = iBlogService.categoryList();
//        model.addAttribute("categoryList", categoryList);
//        return "edit";
//    }
//
//    @PostMapping("/update")
//    public String update(Blog blog) {
//        iBlogService.update(blog);
//        return "redirect:/blog";
//    }
//
//
//    @GetMapping("/search")
//    public String searchByName(String title, @RequestParam(name = "page", defaultValue = "0") int page, Model model) {
//        Page<Blog> list = iBlogService.findByTitle(title, PageRequest.of(page, 2));
//        model.addAttribute("listBlog", list);
//        return "list";
//    }

}
