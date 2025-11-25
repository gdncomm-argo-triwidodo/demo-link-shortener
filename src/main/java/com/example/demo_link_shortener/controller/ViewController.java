package com.example.demo_link_shortener.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/api")
public class ViewController {
    
    @GetMapping("/halo")
    public String getViewController() {
        return "hello";
    }

    @GetMapping("/halo/{name}")
    public String getViewController2(Model model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

}
