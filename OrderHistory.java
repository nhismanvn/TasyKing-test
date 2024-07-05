package com.example.TastyKing.model;


import jakarta.persistence.*;
import java.util.Date;

@Entity
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Date orderDate;
    private String items;

    // Getters and Setters
}

