package com.example.bookworm.Controllers;

import com.example.bookworm.Entities.BookEntity;
import com.example.bookworm.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/addNewBook")
    public void addBook(@RequestBody BookEntity bookEntity){
        System.out.println(bookEntity);
        bookService.saveNewBook(bookEntity);
    }

    @GetMapping("/getAllBooks")
    public List<BookEntity> getBooks(){
        return bookService.getAllBooks();
    }


    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
    }


}
