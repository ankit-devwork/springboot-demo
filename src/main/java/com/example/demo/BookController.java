package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    // Other methods...

    @DeleteMapping("/books/{name}")
    public String deleteBook(@PathVariable String name) {
        // Logic to delete a book by its name
        return "Book with name " + name + " has been deleted.";
    }
}
