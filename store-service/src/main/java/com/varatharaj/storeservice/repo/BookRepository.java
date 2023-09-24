package com.varatharaj.storeservice.repo;

import com.varatharaj.storeservice.model.db.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

