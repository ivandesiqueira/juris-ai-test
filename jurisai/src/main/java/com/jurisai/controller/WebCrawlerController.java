package com.jurisai.controller;

import com.jurisai.model.Movie;
import com.jurisai.Service.WebCrawlerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class WebCrawlerController {

    private final WebCrawlerService webCrawlerService;

    public WebCrawlerController(WebCrawlerService webCrawlerService) {
        this.webCrawlerService = webCrawlerService;
    }

    @GetMapping("/top10")
    public List<Movie> getTopMovies() {
        return webCrawlerService.getTopMovies();
    }
}
