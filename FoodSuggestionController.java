package com.example.TastyKing.controller;

import com.example.TastyKing.model.FoodSuggestion;
import com.example.TastyKing.service.FoodSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggestions")
public class FoodSuggestionController {

    @Autowired
    private FoodSuggestionService foodSuggestionService;

    @GetMapping("/{userId}")
    public List<FoodSuggestion> getSuggestionsByUserId(@PathVariable Long userId) {
        return foodSuggestionService.getSuggestionsByUserId(userId);
    }

    @PostMapping
    public FoodSuggestion createSuggestion(@RequestBody FoodSuggestion foodSuggestion) {
        return foodSuggestionService.createSuggestion(foodSuggestion);
    }
}

