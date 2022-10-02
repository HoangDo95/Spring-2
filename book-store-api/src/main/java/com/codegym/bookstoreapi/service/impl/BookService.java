package com.codegym.bookstoreapi.service.impl;

import com.codegym.bookstoreapi.entity.Book;
import com.codegym.bookstoreapi.repository.IBookRepository;
import com.codegym.bookstoreapi.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository bookRepository;

    @Override
    public List<Book> findALl() {
        return bookRepository.findList();
    }

    @Override
    public Optional<Book> findById(Integer id) {
        return bookRepository.findById(id);
    }
}
