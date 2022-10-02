package com.codegym.bookstoreapi.repository;

import com.codegym.bookstoreapi.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDiscountRepository extends JpaRepository<Discount, Integer> {
}
