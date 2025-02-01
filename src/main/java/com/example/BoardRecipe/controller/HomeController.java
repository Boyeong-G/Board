package com.example.BoardRecipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/") // url
    public String index() {
        System.out.println("HomeController.index");
        return "index"; // html
    }
}