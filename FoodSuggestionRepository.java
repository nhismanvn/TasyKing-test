package com.example.TastyKing.repository;
import com.example.TastyKing.model.FoodSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodSuggestionRepository extends JpaRepository<FoodSuggestion, Long> {
    List<FoodSuggestion> findByUserId(Long userId);
}
