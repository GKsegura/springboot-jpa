package com.gksegura.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gksegura.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
