package com.example.TastyKing.controller;


import com.example.TastyKing.model.OrderHistory;
import com.example.TastyKing.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping
    public List<OrderHistory> getAllOrders() {
        return orderHistoryService.getAllOrders();
    }

    @GetMapping("/{userId}")
    public List<OrderHistory> getOrdersByUserId(@PathVariable Long userId) {
        return orderHistoryService.getOrdersByUserId(userId);
    }

    @PostMapping
    public OrderHistory createOrder(@RequestBody OrderHistory orderHistory) {
        return orderHistoryService.createOrder(orderHistory);
    }
}

