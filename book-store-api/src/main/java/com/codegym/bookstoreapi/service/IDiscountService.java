package com.codegym.bookstoreapi.service;

import com.codegym.bookstoreapi.entity.Discount;

import java.util.List;

public interface IDiscountService {
    List<Discount> findALl();
}
