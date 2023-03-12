package com.utfpr.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utfpr.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}