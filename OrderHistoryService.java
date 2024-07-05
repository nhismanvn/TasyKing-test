package com.example.TastyKing.service;


import com.example.TastyKing.model.OrderHistory;
import com.example.TastyKing.repository.OrderHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderHistoryService {

    @Autowired
    private OrderHistoryRepository orderHistoryRepository;

    public List<OrderHistory> getAllOrders() {
        return orderHistoryRepository.findAll();
    }

    public List<OrderHistory> getOrdersByUserId(Long userId) {
        return orderHistoryRepository.findByUserId(userId);
    }

    public OrderHistory createOrder(OrderHistory orderHistory) {
        return orderHistoryRepository.save(orderHistory);
    }
}

