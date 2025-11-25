package com.example.demo_link_shortener.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_link_shortener.model.Link;
import com.example.demo_link_shortener.model.repository.LinkRepostitory;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/links")
@RequiredArgsConstructor
public class LinkController {

    private final LinkRepostitory linkRepostitory;

    @GetMapping
    public List<Link> getMethodName() {
        return linkRepostitory.findAll();
    }
    
    
}
