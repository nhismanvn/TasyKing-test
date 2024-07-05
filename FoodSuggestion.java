package com.example.TastyKing.model;



import jakarta.persistence.*;

@Entity
public class FoodSuggestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String suggestedItems;

    // Getters and Setters
}
