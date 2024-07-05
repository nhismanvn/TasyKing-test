package com.example.TastyKing.service


import com.example.TastyKing.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(Long id) {
        return restaurantRepository.findById(id);
    }

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Optional<Restaurant> updateRestaurant(Long id, Restaurant restaurantDetails) {
        return restaurantRepository.findById(id).map(restaurant -> {
            restaurant.setName(restaurantDetails.getName());
            restaurant.setAddress(restaurantDetails.getAddress());
            restaurant.setImageUrl(restaurantDetails.getImageUrl());
            restaurant.setPromotion(restaurantDetails.getPromotion());
            return restaurantRepository.save(restaurant);
        });
    }

    public boolean deleteRestaurant(Long id) {
        return restaurantRepository.findById(id).map(restaurant -> {
            restaurantRepository.delete(restaurant);
            return true;
        }).orElse(false);
    }
}

