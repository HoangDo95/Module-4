package com.codegym.service;

import com.codegym.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findById(int id);

    int getBook(int id);

    int returnBook(int id);

}
