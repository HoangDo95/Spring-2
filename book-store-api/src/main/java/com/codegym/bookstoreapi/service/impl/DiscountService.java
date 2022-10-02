package com.codegym.bookstoreapi.service.impl;

import com.codegym.bookstoreapi.entity.Discount;
import com.codegym.bookstoreapi.repository.IDiscountRepository;
import com.codegym.bookstoreapi.service.IDiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountService implements IDiscountService {
    @Autowired
    IDiscountRepository discountRepository;

    @Override
    public List<Discount> findALl() {
        return discountRepository.findAll();
    }
}
