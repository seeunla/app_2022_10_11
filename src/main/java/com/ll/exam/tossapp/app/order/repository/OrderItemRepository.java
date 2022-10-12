package com.ll.exam.tossapp.app.order.repository;

import com.ll.exam.tossapp.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
