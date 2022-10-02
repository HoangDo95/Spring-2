package com.codegym.bookstoreapi.repository;

import com.codegym.bookstoreapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
