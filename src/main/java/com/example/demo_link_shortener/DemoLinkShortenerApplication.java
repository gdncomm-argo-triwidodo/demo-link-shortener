package com.example.demo_link_shortener;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo_link_shortener.model.repository.LinkRepostitory;

@SpringBootApplication
public class DemoLinkShortenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLinkShortenerApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(LinkRepostitory linkRepostitory) {
		return args -> {
			linkRepostitory.saveAll(List.of(
				new com.example.demo_link_shortener.model.Link(
					"https://www.google.com",
					"http://short.ly/1",
					"2024-01-01T10:00:00",
					"2024-01-01T10:00:00"
				),
				new com.example.demo_link_shortener.model.Link(
					"https://www.github.com",
					"http://short.ly/2",
					"2024-01-02T10:00:00",
					"2024-01-02T10:00:00"
				),
				new com.example.demo_link_shortener.model.Link(
					"https://www.stackoverflow.com",
					"http://short.ly/3",
					"2024-01-03T10:00:00",
					"2024-01-03T10:00:00"
				)
			));
		};
	}

}
