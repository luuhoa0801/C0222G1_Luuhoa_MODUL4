package com.codegym.borrowbook.controller;

import com.codegym.borrowbook.model.Book;
import com.codegym.borrowbook.model.OderBook;
import com.codegym.borrowbook.service.IBookService;
import com.codegym.borrowbook.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private IOderService iOderService;
    @Autowired
    private IBookService iBookService;

    @GetMapping("/book")
    public String getShowForm(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Book> list = iBookService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listBook", list);
        return "list";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(@PathVariable String id, Model model) {
        model.addAttribute("book", iBookService.findByCodeBook(id));
        return "edit";
    }

    @PostMapping("/update")
    public String PostUpdate(@ModelAttribute(name = "book") Book book) {
        int idOderBook = (int) ((Math.random() * 90000) + 10000);
        String id = String.valueOf(idOderBook);
        iBookService.update(book);
        iOderService.create(id, book.getIdBook());
        return "redirect:/book";
    }
    @GetMapping("/return")
    public String showReturn( String id) {
        OderBook orderBook = iOderService.findIdOder(id);
        Book book = orderBook.getBooks();
        iBookService.returnBook(book);
        iOderService.delete(orderBook);

        return "redirect:/book";
    }

//    public static void main(String[] args) {
//        int n1 =1;
//        int n2 = 2;
//        int sum = n1 + n2;
//        int a = (int)(Math.random() * 90000) + 10000;
//    }

}
