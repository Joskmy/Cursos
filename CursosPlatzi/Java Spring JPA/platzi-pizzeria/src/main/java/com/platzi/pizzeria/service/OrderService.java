package com.platzi.pizzeria.service;

import com.platzi.pizzeria.persistence.entity.OrderEntity;
import com.platzi.pizzeria.persistence.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderEntity> findAll() {
        return this.orderRepository.findAll();
    }
}
