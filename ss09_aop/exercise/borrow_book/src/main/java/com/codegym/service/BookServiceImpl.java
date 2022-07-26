package com.codegym.service;

import com.codegym.model.Book;
import com.codegym.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public int getBook(int id) {
        int count = bookRepository.getBook(id);
        return count;
    }

    @Override
    public int returnBook(int id) {
        int count = bookRepository.returnBook(id);
        return count;
    }

}
