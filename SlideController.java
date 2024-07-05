package com.example.TastyKing.controller;

import com.example.TastyKing.entity.Slide;
import com.example.TastyKing.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/slides")
public class SlideController {
    @Autowired
    private SlideService slideService;

    @PostMapping
    public ResponseEntity<Slide> addSlide(@RequestBody Slide slide) {
        Slide newSlide = slideService.saveSlide(slide);
        return new ResponseEntity<>(newSlide, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Slide> getAllSlides() {
        return slideService.getAllSlides();
    }
}


