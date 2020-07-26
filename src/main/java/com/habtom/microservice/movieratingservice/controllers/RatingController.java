package com.habtom.microservice.movieratingservice.controllers;

import com.habtom.microservice.movieratingservice.models.Rating;
import com.habtom.microservice.movieratingservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {

@GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }

    @GetMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
        List<Rating> ratings= Arrays.asList(
                new Rating("1022", 5),
                new Rating("1023", 2),
                new Rating("1024", 4)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return  userRating;
    }
}

