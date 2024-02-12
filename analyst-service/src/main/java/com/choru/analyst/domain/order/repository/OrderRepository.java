package com.choru.analyst.domain.order.repository;

import com.choru.analyst.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
