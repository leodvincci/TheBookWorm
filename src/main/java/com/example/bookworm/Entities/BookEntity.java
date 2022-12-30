package com.example.bookworm.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {

    String bookTitle;
    String bookAuthor;
    String bookSummary;
    String bookCoverLink;
    @Id
    private Long id;

    public BookEntity() {

    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookSummary='" + bookSummary + '\'' +
                ", bookCoverLink='" + bookCoverLink + '\'' +
                '}';
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public String getBookCoverLink() {
        return bookCoverLink;
    }

    public void setBookCoverLink(String bookCoverLink) {
        this.bookCoverLink = bookCoverLink;
    }

    public BookEntity(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
