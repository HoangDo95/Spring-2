package com.codegym.bookstoreapi.controller;

import com.codegym.bookstoreapi.entity.Book;
import com.codegym.bookstoreapi.entity.Category;
import com.codegym.bookstoreapi.entity.Discount;
import com.codegym.bookstoreapi.repository.ICategoryRepository;
import com.codegym.bookstoreapi.service.IBookService;
import com.codegym.bookstoreapi.service.ICategoryService;
import com.codegym.bookstoreapi.service.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/book")
public class BookRestController {
    @Autowired
    IBookService bookService;

    @Autowired
    IDiscountService discountService;

    @Autowired
    ICategoryService categoryService;

    @GetMapping("/list")
    public ResponseEntity<List<Book>> bookList() {
        List<Book> bookList = bookService.findALl();
        if (bookList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @GetMapping("/category/list")
    public ResponseEntity<List<Category>> categoryList() {
        List<Category> categoryList = categoryService.findALl();
        if (categoryList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/discount/list")
    public ResponseEntity<List<Discount>> discountList() {
        List<Discount> discountList = discountService.findALl();
        if (discountList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(discountList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Integer id) {
        Optional<Book> book = bookService.findById(id);
        if (!book.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(book.orElse(null), HttpStatus.OK);
    }

}
