package com.example.TastyKing.model;


import jakarta.persistence.*;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Restaurant(Long id, String name, String address, String imageUrl, String promotion) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.imageUrl = imageUrl;
        this.promotion = promotion;
    }

    private String name;
    private String address;
    private String imageUrl;
    private String promotion;


    }

    // Getters and Setters


