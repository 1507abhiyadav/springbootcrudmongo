package com.springmongo.springcrudmongo.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.springcrudmongo.model.Book;
import com.springmongo.springcrudmongo.repository.BookRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepo;
    
    @PostMapping("/add")
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "added book with id :" + book.getId();
    }
    
    @GetMapping("/allbook")
    public List<Book> getBooks(){
       return  bookRepo.findAll();
    }

    @GetMapping("/allbook/{id}")
    public Optional<Book> getBook(@PathVariable int id){
         return bookRepo.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepo.deleteById(id);
        return "book delete with id :" + id;
    }

}
