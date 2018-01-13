package com.example.filip.project1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.filip.project1.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
