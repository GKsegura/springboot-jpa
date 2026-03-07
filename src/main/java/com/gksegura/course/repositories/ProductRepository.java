package com.gksegura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gksegura.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
