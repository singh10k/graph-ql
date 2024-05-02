package com.graphQL.in.service;

import com.graphQL.in.model.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);
    List<Book> getALL();
    Book get(int BookId);
}
