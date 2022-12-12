package com.springmongo.springcrudmongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


@Document(collection = "Book")

public class Book {
    private int id;
    private String BookName;
    private String authorName;

}
