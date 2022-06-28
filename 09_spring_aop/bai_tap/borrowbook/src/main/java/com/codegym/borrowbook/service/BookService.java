package com.codegym.borrowbook.service;

import com.codegym.borrowbook.model.Book;
import com.codegym.borrowbook.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public Page<Book> getAll(Pageable pageable) {
        return iBookRepository.findAllBook(pageable);
    }

    @Override
    public Book findByCodeBook(String idBook) {
        return iBookRepository.findByCodeBook(idBook);
    }

    @Override
    public void update(Book book) {
        iBookRepository.update(book.getAmount(), book.getIdBook());
    }
}
