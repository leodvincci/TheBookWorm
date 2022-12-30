package com.example.bookworm.Repos;

import com.example.bookworm.Entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity,Long> {

}
