package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/books")
public class BookController {

    private List<String> books = new ArrayList<>(Arrays.asList("Clean Code", "Design Patterns"));

    @GetMapping("/list")
    public List<String> getBooks() {
        return books;
    }

    @PostMapping
    public void addBook(@RequestBody String book) {
        books.add(book);
    }

    // TODO: Implement Delete functionality
    // TODO: Implement Update functionality
}