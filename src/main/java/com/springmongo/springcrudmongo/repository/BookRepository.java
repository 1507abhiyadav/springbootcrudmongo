package com.springmongo.springcrudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.springcrudmongo.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {
    
}
