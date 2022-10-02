package com.codegym.bookstoreapi.repository;

import com.codegym.bookstoreapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {
   @Query(value = "select * from book", nativeQuery = true)
   List<Book> findList();

}
