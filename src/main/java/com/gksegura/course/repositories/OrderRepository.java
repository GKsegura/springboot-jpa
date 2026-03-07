package com.gksegura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gksegura.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
