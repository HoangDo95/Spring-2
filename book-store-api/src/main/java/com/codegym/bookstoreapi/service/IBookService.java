package com.codegym.bookstoreapi.service;

import com.codegym.bookstoreapi.entity.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> findALl();

    Optional<Book> findById(Integer id);
}
