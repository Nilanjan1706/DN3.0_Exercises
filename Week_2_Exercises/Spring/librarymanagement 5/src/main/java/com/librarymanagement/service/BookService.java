package com.librarymanagement.service;

import com.librarymanagement.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // logic methods
    public void performService() {
        // Logic that uses bookRepository
        System.out.println("Service is performing using BookRepository");
    }
}