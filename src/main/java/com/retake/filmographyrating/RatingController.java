package com.retake.filmographyrating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @GetMapping("{/movieID}")
    public Rating getRatingByMovieID(
            @PathVariable("movieID")String movieID){
        return new Rating(movieID, 1);
    }
}
