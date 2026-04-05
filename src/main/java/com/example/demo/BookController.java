package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

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

    @DeleteMapping("/{bookName}")
    public ResponseEntity<String> deleteBook(@PathVariable String bookName) {
        if (books.remove(bookName)) {
            return ResponseEntity.ok("Book removed successfully.");
        } else {
            return ResponseEntity.status(404).body("Book not found.");
        }
    }
}
