package com.example.TastyKing.service;


import com.example.TastyKing.entity.Slide;
import com.example.TastyKing.repository.SlideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SlideService {
    @Autowired
    private SlideRepository slideRepository;

    public Slide saveSlide(Slide slide) {
        return slideRepository.save(slide);
    }

    public List<Slide> getAllSlides() {
        return slideRepository.findAll();
    }
}

