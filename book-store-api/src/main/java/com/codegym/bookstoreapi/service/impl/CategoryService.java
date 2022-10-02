package com.codegym.bookstoreapi.service.impl;

import com.codegym.bookstoreapi.entity.Category;
import com.codegym.bookstoreapi.repository.ICategoryRepository;
import com.codegym.bookstoreapi.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;

    @Override
    public List<Category> findALl() {
        return categoryRepository.findAll();
    }
}
