package com.example.bookworm.Services;

import com.example.bookworm.Entities.BookEntity;
import com.example.bookworm.Repos.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    public void saveNewBook(BookEntity bookEntity){
        bookRepo.save(bookEntity);
    }

    public List<BookEntity> getAllBooks(){
        return bookRepo.findAll();
    }

    public void deleteBook(Long bookID){
        bookRepo.deleteById(bookID);
        System.out.println("Book has been removed.");
    }

}
