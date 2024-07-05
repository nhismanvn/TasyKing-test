package com.example.TastyKing.service;

import com.example.TastyKing.model.FoodSuggestion;
import com.example.TastyKing.repository.FoodSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodSuggestionService {

    @Autowired
    private FoodSuggestionRepository foodSuggestionRepository;

    public List<FoodSuggestion> getSuggestionsByUserId(Long userId) {
        return foodSuggestionRepository.findByUserId(userId);
    }

    public FoodSuggestion createSuggestion(FoodSuggestion foodSuggestion) {
        return foodSuggestionRepository.save(foodSuggestion);
    }
}

