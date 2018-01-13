package com.example.filip.project1.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.filip.project1.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
