package com.retake.filmographyrating;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("/{movieID}")
    public Rating getRatingByMovieID(@PathVariable("movieID") String movieID){
        return new Rating(movieID, 1);
    }

    @GetMapping("users/{userID}")
    public UserRating getRating(@PathVariable("userID") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("Title",3),
                new Rating("Title2",112)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
