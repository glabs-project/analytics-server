package com.example.guitarshop.controller;

import com.example.guitarshop.model.Review;
import com.example.guitarshop.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public Review createReview(@RequestBody Review review) {
        return reviewService.saveReview(review);
    }
}
