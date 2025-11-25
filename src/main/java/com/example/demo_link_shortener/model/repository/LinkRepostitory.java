package com.example.demo_link_shortener.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_link_shortener.model.Link;

public interface LinkRepostitory extends JpaRepository<Link , String> {

}
